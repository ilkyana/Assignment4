package Practice.Assignment4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt() ;
        }
        for(int i = n-1 ; i >=0 ; i--){
            System.out.print(arr[i] + " --> ");
        }
    
    }
    
}
