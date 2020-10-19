package Practice.Assignment4;

import java.util.Scanner;

public class Question2and3 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt() ;
        }
        System.out.println("Enter the number ");
        int M = s.nextInt() ;
        int index = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == M){
                index = i  ;
                break ;
            }
        }
        if(index != 0){
            System.out.println("The index is "+ index);
        } else{
            System.out.println("-1");
        }
        
    }
    
}
