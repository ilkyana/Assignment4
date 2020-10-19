package Practice.Assignment4;

import java.util.Arrays;

public class Question13 {
    public static void main(String[] arg){
        int [] arr = {3,1,9,7,5,-1};
        int target = 9 ;
        triplets(arr, target);

    }
    public static void triplets(int[] arr , int target){
        Arrays.sort(arr);
            int n = arr.length ;
            int start =  0 ;
            while(start < n-2 ){
                int mid = start + 1 ;
            int end = n-1 ;
                while(mid < end){
                    if((arr[start] + arr[mid] + arr[end])== target){
                        System.out.println("["+arr[start]+" , "+arr[mid]+" , "+arr[end]+"]");
                        mid++ ;
                } else if((arr[start] + arr[mid] + arr[end]) < target){
                    mid++ ;
                } else{
                    end-- ;
                }
                
            }
            start++;
    }
    
    }}
