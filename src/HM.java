//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Map;
import java.util.HashMap;

public class HM {
    public static void main(String[] args){
        String Sentence = "This is a test. test is this.";
        CountOccurences(Sentence);
    }
    static void CountOccurences(String Sentence){
        Sentence = Sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = Sentence.split("\\s+");
        Map<String,Integer> WordCount = new HashMap<>();
        for(String word:words){
            if(WordCount.containsKey(word)){
                WordCount.put(word,WordCount.get(word)+1);
            }else{
                WordCount.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry:WordCount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }
    }
}