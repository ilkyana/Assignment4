package Practice.Assignment4;

public class Question5 {
    public static void main(String[] arg){
        int[] arr = {3,2,1,4,5};
        change(arr);
        for(int i = 1 ; i<= arr.length ; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void change(int[] arr){
        int n = arr.length ;
        for(int i = n; i >= 1 ; i--){
            if(i != arr[arr[i]]){
                int temp = arr[i];
                arr[i] = arr[arr[i]] ;
                arr[arr[i]] = temp ;
            }
        }
    }
    
}
