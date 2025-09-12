//linear search
//5
// 4 2 9 67 232
// search : 9
//output: 2
import java.util.*;
public class LinearSearch {
    public static int search(int[] arr ,int key){
        int n =arr.length;
        for(int i =0; i < n;i++){
            if(arr[i]==key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n;i++){
            arr[i]= sc.nextInt();
        }
        int key =  sc.nextInt();
        System.out.println(search(arr,key));
    }
}
