package Practice.Assignment4;

public class Question14 {
    public static void main(String[] arg){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        sum(arr1, arr2);

    }
    public static void sum(int []arr1 , int [] arr2 ){
        int m = arr1.length ;
        int n = arr2.length;
       
        int i = 0;
        int j = 0 ;
        while(i < n || j < m){
            int sum = 0 ;
            sum = sum + (arr1[i] + arr2[j]);
            System.out.print(sum + " ");
            i++;
            j++;
        }
        
    }
    
}
