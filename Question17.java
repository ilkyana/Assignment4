package Practice.Assignment4;

public class Question17 {
    public static void main(String[] arg){
        int[][] arr = {{1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}
     };
     rowWise(arr);

    }
    public static void rowWise(int[][] arr){
       int n = arr.length ;
        for(int row = 0 ; row < n ; row++){
            if(row % 2 ==0){
                for(int j = 0 ; j <= n-1 ; j++){
                    System.out.print(arr[row][j] + " ");
                }
            } else{
                for(int j = arr.length-1 ; j >= 0 ; j--){
                    System.out.print(arr[row][j] + " ");
                }
            }
        }
    }
    
}
