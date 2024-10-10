public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(isUgly(98));
    }
    static int count(int n , int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return count(n/10,c+1);
        }
        return count(n/10 , c);
    }
    static boolean isPowerOfFour(int n) {
        for(int i = 0; i < 31; i++){
            int ans = (int)Math.pow(4,i);
            if(ans == n){
                return true;
            }
        }
        return false;
    }
    static boolean isUgly(int n) {
        if(n == 0){
            return false;
        }
        if(n>0&&n<=3){
            return true;
        }
        if(n%2==0){
            return isUgly(n/2);
        }
        if(n%3==0){
            return isUgly(n/3);
        }
        if(n%5==0){
            return isUgly(n/5);
        }
        return false;
    }
}
