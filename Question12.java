package Practice.Assignment4;

public class Question12 {
    public static void main(String[] arg){
        int [] arr = {3,1,9,7,5,-1};
        int target = 8 ;
        pair(arr, target);

    }
    public static void pair(int [] arr , int target){
        int n = arr.length ;
        
        int start = 0 ;
        while(start < n-1){
            int end = start + 1 ;
            while(end < n){
                if(arr[start] + arr[end] == target){
                    System.out.println("["+arr[start]+" , " + arr[end] + "]");
                }
                end ++ ;
            }
            start++ ;

        }
        
    }
    
}
