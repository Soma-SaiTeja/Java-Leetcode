import java.util.ArrayList;

public class LinRec {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Find(arr,9,0,new ArrayList<>()));
    }
    static ArrayList Find(int[] arr, int n, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == n){
        list.add(index);
        }
        return Find(arr,n,index+1,list);
    }
}
