package Practice.Assignment4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = s.nextInt();
        int [] arr = new int[length];
        System.out.println("Enter the array");
        for(int i = 0 ; i < length ; i++){
            arr[i] = s.nextInt();
        }
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < length ; i++){
            if(max < arr[i]){
                max = arr[i] ;
            }
           
        }
        System.out.println("The maximum value is " + max);
    }
    
}
