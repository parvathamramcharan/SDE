//similar to minimum jumps needed to move from dtart to end but 
//here return just possible or not as true or false
package DS;
import java.util.*;
public class MinimumJumps2 {
    public static boolean possible(int[] arr){
        int maxReach = arr[0];
        if(arr.length <=1) return true;
        for(int i =1 ; i < arr.length;i++){
            if(i > maxReach) return false;
            maxReach = Math.max(maxReach,i+arr[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n;i++){
            arr[i]= sc.nextInt();
        }
        if(possible(arr)){
            System.out.println("can jump to last");
        }
        else{
            System.out.println("Cannot jump to the last");
        }
    }
}
