package Practice.Assignment4;

public class Question9 {
    public static void main(String[] arg){
        int[] arr = {64,25,12,22,11};
        selection(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void selection(int[] arr){
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            int min = i ;
            for(int j = i+1 ; j < arr.length ; j++){
                if( arr[j] < arr[min]){
                    min = j;
                } 

                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp ;
                
                

            }

        }
       
    }
    
}
