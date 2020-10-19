package Practice.Assignment4;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = s.nextInt();
        int [] arr = new int[length+1];
        System.out.println("Enter the array");
        for(int i = 0; i < length ; i++){
            arr[i] = s.nextInt();
        }  
        boolean flag = true ;
        for(int i = 0; i < length; i++){
            if(i != arr[arr[i]]){
               flag = false ;
               
            }
           
        }
        
        if(flag == true){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

    }
    
}
