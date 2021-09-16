package demo.example;


import org.junit.Test;

public class testDemo{


/*    public static void TxtNotFoundExceptionTest(String path){
        path = "E://";
        try {
            File file = new File(path);
            if (!(file.exists())) throw new TxtNotFoundException(path+"路径下文件未找到");
        }catch (demo.example.Exception e){
            e.printStackTrace();
        }
    }

    public static void EmptyTxtExceptionTest(String path){
        path="D:\\测试文本2\\empty.txt";
        String str = demo.example.IOHandler.textToString(path);
        if(str.length()==0) try {
            throw new EmptyTxtException(path+"文件为空");
        } catch (EmptyTxtException e) {
            e.printStackTrace();
        }
    }*/
    @Test
    public void procedureSimulate(){
        Processor p = new Processor();
        /*接收参数
        * D:\\测试文本2\\orig.txt
        * D:\\测试文本2\\orig_0.8_del.txt
        * D:\\测试文本2\\result.txt
        * */
        String originPath = "D:\\测试文本2\\orig.txt";
        String comparePath = "D:\\\\测试文本2\\\\orig_0.8_dis_15.txt";
        String outputPath = "D:\\\\测试文本2\\\\result.txt";
        /*处理数据*/
        try {
            p.wordsMap=p.SentenceSegment(IOHandler.textToString(originPath),0);
            p.wordsMap=p.SentenceSegment(IOHandler.textToString(comparePath),1);
            /*计算结果*/
            float result = p.cosineCalculate(p.wordsMap);
            p.wordsMap.clear();
            /*输出结果*/
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void EntryTest(){
        /*接收参数
         * D:\\测试文本2\\orig.txt
         * D:\\测试文本2\\orig_0.8_del.txt
         * D:\\测试文本2\\result.txt
         * */
        String originPath = "D:\\测试文本2\\orig.txt";
        String comparePath = "D:\\\\测试文本2\\\\orig_0.8_dis_15.txt";
        String outputPath = "D:\\\\测试文本2\\\\result.txt";
        String[] args = new String[]{originPath,comparePath,outputPath};
        Entry e =new Entry();
        e.main(args);
    }

    @Test
    public void EmptyExceptionTest(){
        String originPath = "D:\\测试文本2\\orig.txt";
        String comparePath = "D:\\\\测试文本2\\\\empty.txt";
        String outputPath = "D:\\\\测试文本2\\\\result.txt";
        String[] args = new String[]{originPath,comparePath,outputPath};
        Entry e =new Entry();
        e.main(args);

    }

    @Test
    public void NotFoundETest(){
        String originPath = "D:\\测试文本2\\orig.txt";
        String comparePath = "D:\\\\测试文本2\\\\non-exist.txt";
        String outputPath = "D:\\\\测试文本2\\\\result.txt";
        String[] args = new String[]{originPath,comparePath,outputPath};
        Entry e =new Entry();
        e.main(args);
    }
}
