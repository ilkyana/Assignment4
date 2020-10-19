package Practice.Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question11 {
    public static void main(String[] arg){
        int[] arr1 = {1,2,3,1,2,4,1};
        int[] arr2 = {2,1,3,1,5,2,2};
        intersection(arr1, arr2);
       
        


    }
    public static void intersection(int[] arr1 , int[] arr2){
        if(arr1.length == 0 || arr2.length == 0 || arr1 == null || arr2 == null){
            System.out.println("No");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0 ;
        int j = 0 ;
        int m = arr1.length ;
        int n = arr2.length ;
        while(i < m && j < n){
            if(arr1[i] == arr2[j]){
               System.out.println(arr1[i]);
               i++;
               j++;
            } else if(arr1[i] < arr2[j]){
                i++ ;
            } else{ 
                j++;
            }
        }
    }
    
}
