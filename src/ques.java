import java.util.HashMap;
import java.util.Map;

public class ques {
    public static void main(java.lang.String[] args) {
       // String sentence = "momdaddymadam";
        //int n = 10;
//        String s1 = "welcome";
//        String s2 = "come";
//        System.out.println(check(s1,s2));
        int[] arr = {0,2,3,4,50,100,90,80,76,2};
        find(arr);
        // Call the function to count words

    }
    static String Rev(String s) {
        String rev = "";
        for(int i = s.length()-1; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    static void HMap(String sentence){
        String[] word = sentence.split("\\s+");
        Map<String,Integer> Count = new HashMap<>();
        for(String w : word){
            if(Count.containsKey(w)){
                Count.put(w,Count.get(w)+1);
            }else{
                Count.put(w,1);
            }
        }
        for(Map.Entry<String,Integer> entry : Count.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static boolean isPalin(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static String Lpalin(String s){
        String Largest = " ";
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
              String substring = s.substring(i,j);
              if(isPalin(substring)&& substring.length()>Largest.length()){
                  Largest = substring;
              }
            }
        }
        return Largest;
    }

    static boolean palin(int n){
        int original = n;
        int rev = 0;
        while(n!=0){
        int rem = n%10;
        rev = rev*10+rem;
        n = n/10;
    }
        return original == rev;
    }

    static int fibo(int n){
        int n1 = 0;
        int n2 = 1;

        for(int i=2;i<n;i++){
            int c = n1+n2;
            n1 = n2;
            n2 = c;
        }
        return n2;
    }static boolean check(String s1, String s2){
        int i = 0;
        int j = 0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
                if(j==s2.length()){
                    return true;
                }
            }else{
                i++;
                j = 0;
            }
        }
        return false;
    }

    static void find(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}


