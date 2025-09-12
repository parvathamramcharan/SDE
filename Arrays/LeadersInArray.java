// Leaders in an Array
// Problem Statement: Given an array, print all the elements which are leaders. 
//A Leader is an element that is greater than
// all of the elements on its right side in the array.
// Input: arr = [4, 7, 1, 0]
// Output: 7 1 0
import java.util.*;
public class LeadersInArray {
    public static ArrayList<Integer>  leaders(int[] arr){
        ArrayList<Integer>  res = new ArrayList<>();
        int n = arr.length;
        res.add(arr[n-1]);
        int max = arr[n-1];
        for(int  i= n-2;i>=0;i--){
            if(arr[i] > max){
                max = arr[i];
                res.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ;i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> ans = leaders(arr);
        Collections.sort(ans,Collections.reverseOrder());
        System.out.println(ans);

    }
}
