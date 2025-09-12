// Two Sum : Check if a pair with given sum exists in Array
//  Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
// Result: YES 
// Explanation: arr[1] + arr[3] = 14
import java.util.*;
public class TwoSum2 {
    public static boolean exists(int[] arr , int target){
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for(int i =0; i < n ;i++){
            int compliment = target-arr[i];
            if(hs.contains(compliment)){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i =0 ; i < n;i++){
        arr[i]= sc.nextInt();
       }
       int target = sc.nextInt();
       if(exists(arr,target)){
            System.out.println("pair exists");
       }
       else{
        System.out.println("pair not exists");
       }
    }//o(n) time 
}
// thhi saslo another method but o(n)2 time 
// import java.util.*;
// public class Main
// {
//     public static boolean pair(int[] arr  , int target){
//         int len = arr.length;
//         int sum;
//         for(int i =0 ; i < len;i++){
//             sum = target - arr[i];
//             if(check(arr,sum,arr[i])){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static boolean check(int[] arr, int sum,int num){
//         for(int i =0 ; i < arr.length;i++){
//             if(arr[i] == sum && arr[i] != num  ){
//                 return true;
//             }
//         }
//         return false;
//     }
// 	public static void main(String[] args) {
// 		int[] arr = new int[] {2,6,5,8,11};
// 		int target= 14;
// 		if(pair(arr,target)){
// 		    System.out.println("YES");
// 		}
// 		else{
// 		    System.out.println("NO");
// 		}
// 	}
// }