import Exception.TxtNotFoundException;
import Exception.EmptyTxtException;

import java.io.File;

public class testDemo{
    public static void main(String[] args) {
        TxtNotFoundExceptionTest(new String());
    }

    public static void TxtNotFoundExceptionTest(String path){
        path = "E://";
        try {
            File file = new File(path);
            if (!(file.exists())) throw new TxtNotFoundException(path+"路径下文件未找到");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void EmptyTxtExceptionTest(String path){
        path="D:\\测试文本2\\empty.txt";
        String str = IOHandler.textToString(path);
        if(str.length()==0) try {
            throw new EmptyTxtException(path+"文件为空");
        } catch (EmptyTxtException e) {
            e.printStackTrace();
        }
    }
}
