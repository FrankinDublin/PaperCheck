import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import Exception.TxtNotFoundException;
import Exception.EmptyTxtException;
public class IOHandler {

    /*
     * 将文本文档转化为字符串
     * path：文本文档的绝对路径
     * */
    public static String textToString(String path){
        String str="";
        File file=new File(path);
        if (!file.exists()) try {
            throw new TxtNotFoundException(path+"路径下文件未找到");
        } catch (TxtNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in=new FileInputStream(file);
            // size  为字串的长度 ，这里一次性读完
            int size=in.available();
            byte[] buffer=new byte[size];
            in.read(buffer);
            in.close();
            str=new String(buffer,"UTF-8");
        } catch (IOException e) {
            return null;
        }
        if(str.length()==0) try {
            throw new EmptyTxtException(path+"文件为空");
        } catch (EmptyTxtException e) {
            e.printStackTrace();
        }
        return str;
    }

    /*
     *  将查重结果以文本文档形式输出
     *  result : 查重结果
     *  path : 文件输出目录
     * */
    public static void resultToText(float result,String path){
        File file = new File(path);
        String result_Str = result+"";
        result_Str = result_Str.substring(0,4);
        try (FileOutputStream fop = new FileOutputStream(file)) {

            // 若文件不存在则创建新文件
            if (!file.exists()) {
                file.createNewFile();
            }

            //byte方式获取字符串
            byte[] contentInBytes = result_Str.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
