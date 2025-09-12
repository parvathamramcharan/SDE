//finding the second largest and second smallest number in the array
import java.util.*;
public class SecondLargeSmall {
    public static int secondLarge(int[] arr){
        int n = arr.length;
        int large= Integer.MIN_VALUE;
        int s_large= Integer.MIN_VALUE;
        for(int i =0 ; i < n;i++){
            if(arr[i] > large){
                s_large= large;
                large= arr[i];
            }
            else if(arr[i] > s_large && arr[i]!= large){
                s_large= arr[i];
            }
        }
        return (s_large==Integer.MIN_VALUE) ? -1 : s_large; 
    }
    public static int secondSmall(int[] arr){
        int n = arr.length;
        int small = Integer.MAX_VALUE;
        int s_small =Integer.MAX_VALUE;
        for(int i =0 ; i < n ;i++){
            if(arr[i] < small){
                s_small = small;
                small = arr[i];
            }
            else if( arr[i] < s_small && arr[i] != small){
                s_small = arr[i];
            }
        }
        return  (s_small==Integer.MAX_VALUE) ? -1 : s_small;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i =0; i < n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("second largest is " + secondLarge(arr));
       System.out.println("second smallest is "+ secondSmall(arr));
    }
}
