public class Stream {
    public static void main(String[] args) {
        int [] arr = {1,2,5,25,98,101};
        int target = 25;
        System.out.println(BS(arr, target,0,arr.length-1));
    }
//    static String skip(String up){
//        if(up.isEmpty()){
//            return " ";
//        }
//        char ch = up.charAt(0);
//        if(ch == 'a'){
//            return skip(up.substring(1));
//        }else{
//            return ch + skip(up.substring(1));
//        }
//    }
//    static String skipApple(String up){
//        if(up.isEmpty()){
//            return " ";
//        }
//        if(up.startsWith("apple")){
//            return skipApple(up.substring(5));
//        }else{
//            return up.charAt(0) + skipApple(up.substring(1));
//        }
//    }
    static void fun(int n){
        if(n == 6){
            return ;
        }
        System.out.println(n);
        fun(n+1);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }

    return fibo(n-1) + fibo(n-2);
    }

    static int SumDigits(int n){
        if( n == 0){
            return 0;
        }
        return n%10 + SumDigits(n/10);
    }
    static int Fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * Fact(n-1);
    }
    static void int1(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        int1(n+1);
    }
    static int BS(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return BS(arr, target, s, mid -1 );
        }
        return BS(arr, target, mid +1, e);
    }
    static void fibo(int[] arr){

    }
    }
