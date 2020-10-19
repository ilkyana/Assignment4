package Practice.Assignment4;

public class Question10 {
    public static void main(String[] arg){
        int[] arr = {64,25,12,22,11};
        insertion(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1 ;
            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1 ;
            }
            arr[j+1] = key ;
        }
    }
    
}
