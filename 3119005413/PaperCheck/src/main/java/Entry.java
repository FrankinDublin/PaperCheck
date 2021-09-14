public class Entry {
    public static void main(String[] args) {

        Processor p = new Processor();
        /*接收参数*/
        String originPath = args[0];
        String comparePath = args[1];
        String outputPath = args[2];
        /*处理数据*/
        p.wordsMap=p.SentenceSegment(IOHandler.textToString(originPath),0);
        p.wordsMap=p.SentenceSegment(IOHandler.textToString(comparePath),1);
        /*计算结果*/
        float result = p.cosineCalculate(p.wordsMap);
        p.wordsMap.clear();
        /*输出结果*/
        IOHandler.resultToText(result,outputPath);
    }
}
