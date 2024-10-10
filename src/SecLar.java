public class SecLar {
    public static void main(String[] args) {
        int[] arr = {2,7,10,3,5};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int Largest, SecLargest;
        if(arr[0]>arr[1]){
            Largest = arr[0];
            SecLargest = arr[1];
        }else{
            Largest = arr[1];
            SecLargest = arr[0];
        }
        for(int i =2;i<arr.length;i++){
            if(arr[i]>Largest){
                SecLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i]>SecLargest & arr[i]!=Largest){
                SecLargest = arr[i];
            }
        }
        return SecLargest;
    }
}
