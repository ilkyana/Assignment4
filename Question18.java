package Practice.Assignment4;

public class Question18 {
    public static void main(String[] arg){
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12}
                     };
                     columnWise(arr);

    }
    public static void columnWise(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ; i < col ; i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < row ; j++){
                    System.out.print(arr[j][i] + " ");
                }
            } else{
                for(int j = row-1 ; j >= 0 ;j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
    
}
