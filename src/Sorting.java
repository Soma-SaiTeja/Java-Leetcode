import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        QuickSort(arr,0,arr.length  -1);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
    }
    static void BubSort(int[] arr, int i, int j){
        if(i == 0){
            return;
        }
        if(j<i) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            BubSort(arr, i, j + 1);
        }
        else{
            BubSort(arr,i-1, 0);
        }
        }
        static void SelSort(int[] arr, int i, int j, int max){
        if(i == 0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[max]){
                SelSort(arr,i,j+1,j);
            }else{
                SelSort(arr,i,j+1,max);
            }
        }
        else{
            int temp = arr[i-1];
            arr[i-1] = arr[max];
            arr[max] = temp;
        }
        SelSort(arr,i-1,0,0);
        }
        static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
         return Merge(left,right);
        }
        static int[] Merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k= 0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
        }
        static void QuickSort(int[] arr,int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int p = arr[m];
        while(s <= e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(arr,s,hi);
        QuickSort(arr,low,e);
        }
    }
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//import java.util.Arrays;
//
//class FiboN {
//    public static void main(String[] args) {
//        int[] arr = {0,0,1,1,1,0,1,0,1,1};
//        int count = sorted(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(count);
//    }
//    static int sorted(int[] arr){
//        int left = 0;
//        int right = arr.length- 1;
//        int count = 0;
//        while(left<right){
//            if(arr[left]==0){
//                left++;
//            }else if(arr[right]==1){
//                right--;
//                count++;
//            }
//            else{
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++
//                right--;
//                count++;
//            }
//        }
//        while (left <= right) {
//            if (arr[left] == 1) {
//                count++;
//            }
//            left++;
//        }
//
//        return count;
//    }
//}
//class Numbers{
//    int sum(int a, int b){
//        return a+b;
//    }
//    int sum(int a, int b, int c){
//        return a+b+c;
//    }
//}
//public class main{
//    public static void main(String[] args){
//        Numbers obj = new Numbers();
//        System.out.println(obj.sum(3,5,9));
//    }
//
//}
