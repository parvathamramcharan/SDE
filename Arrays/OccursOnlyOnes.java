// Find the number that appears once, and the other numbers twice
// Input Format:
//  arr[] = {4,1,2,1,2}
// Result:
//  4
// In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
import java.util.*;
public class OccursOnlyOnes {
    public static int result(int[] arr){
        int n = arr.length;
        int xor = 0;
        for(int i =0 ; i < n ;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(result(arr));
    }
}
