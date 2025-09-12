//minimum jumps that are required to move element from first to last
//each value at index points where it can max jump, if 0 no jump
// arr[]= {1,3,5,8,9,2,6,7,6,8,9};
//output=> 3;
//not possible return -1;
package DS;
import java.util.*;
public class MinimumJumps {
    public static int  result(int[] arr){
        if(arr[0]==0){
            return -1;
        }
        if(arr.length<=1){
            return 0;
        }
        int maxReach = arr[0];
        int steps= arr[0];
        int jumps=1;

        for(int i =1 ; i < arr.length;i++){
            if( i==arr.length-1){
                return jumps;
            }
            maxReach = Math.max(maxReach,i+arr[i]);
            steps--;
            if(steps==0){
                jumps++;
                if( i >= maxReach){
                    return -1;
                }
                steps= maxReach-i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ;i++){
            arr[i]= sc.nextInt();
        }
        int ans  = result(arr);
        System.out.println(ans);
    }
}
