package Practice.Assignment4;

public class Question8 {
    public static void main(String[] arg){
        int[] arr = {4,1,7,2,4,9};
        bubble(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void bubble(int[] arr){
        int n = arr.length ;
        for(int i =0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }
    
}
