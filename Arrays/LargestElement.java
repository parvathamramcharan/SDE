//largest element in the array
import java.util.*;
public class LargestElement {
    public static int largest(int[] arr){
        int n = arr.length;
        int max= Integer.MIN_VALUE;
        for(int i =0 ; i < n;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i =0  ; i  < n ;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println(largest(arr));
    }
}
