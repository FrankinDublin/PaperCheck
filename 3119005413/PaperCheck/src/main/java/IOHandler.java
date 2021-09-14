import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOHandler {

    /*
     * 将文本文档转化为字符串
     * path：文本文档的绝对路径
     * */
    public static String textToString(String path){
        String str="";
        File file=new File(path);
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
        return str;
    }

    /*
     *  将查重结果以文本文档形式输出
     *  result : 查重结果
     * */
    public void resultToText(String result){}
}
