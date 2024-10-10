public class BS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(RBS(arr,3,0,arr.length-1));
    }
    static int RBS(int[] arr,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]>arr[mid]){
            if(arr[s]<=target&&arr[mid]>=target){
                return RBS(arr,target,s,mid-1);
            }else{
                return RBS(arr,target,mid+1,e);
            }
        }
        if(arr[e]>arr[mid]){
            if(arr[e]>=target&&arr[mid]<=target) {
                return RBS(arr, target, mid + 1, e);
            }
        }
        return RBS(arr,target,s,mid-1);
    }
}
