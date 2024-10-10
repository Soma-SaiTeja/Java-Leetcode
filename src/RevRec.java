//public class RevRec {
//    static int sum =0;
//    static int Rev(int n){
//        if(n==0){
//            return 0;
//        }
//        int rem = n%10;
//        sum = sum*10+rem;
//         return Rev(n/10);
//    }
//    static boolean Palin(int n){
//        return n == Rev(n);
//        }
//        public String Revs(){
//        if(int i<0){
//          return Revs;
//        }
//        }

//    public static void main(String[] args) {
//        System.out.println(Palin(1234554321));
//    }
//}
//
//    static int Rev(int n,int ans){
//        if(n==0){
//            return ans;
//        }
//        int rem = n%10;
//        ans = ans*10+rem;
//        return Rev(n/10,ans);
//    }
//    static boolean palindrome(int n){
//        if(n == Rev(n,0)){
//            return true;
//        }else{
//            return false;
//        }
//
//    }

//static int fibo(int n){
//    if(n<2){
//        return n;
//    }
//    return fibo(n-1)+fibo(n-2);
//}

//static String Rev(String s){
//    String rev = "";
//    for(int i = s.length()-1;i>=0;i--){
//        rev = rev + s.charAt(i);
//    }
//    return rev;
//}
