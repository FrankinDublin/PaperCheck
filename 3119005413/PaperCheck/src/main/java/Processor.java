import java.util.Map;

public class Processor {
    /*
    * 分词存储映射，用来装载分词结果
    *  String : 分词结果
    *  int : 长度为2的数组，第一位储存该词组来自原文章的数量，第二位存储该词组来自比较文章的数量
    * */
    private Map<String, int[]> wordsMap;
    /*
    *  将文章进行分词
    *  sentence : 转化为字符串的文章内容
    *  index : 标记该分词来自于哪篇文章；0表示元文章，1表示比较文章
    * */
    public static Map<String, int[]> SentenceSegment(String sentence, int index){return null;}

    /*
    *  根据分词结果计算余弦值
    *   map : 分词存储映射
    * */
    public static float cosineCalculate(Map<String,int[]> map){ return 0; }
}
