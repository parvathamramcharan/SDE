// Search in a sorted 2D matrix
// Input Format:
//  M = 3, N = 4, target = 8,
// mat[] = 
// 1 2 3 4
// 5 6 7 8 
// 9 10 11 12
// Result:
//  true
package matrix;
import java.util.*;
public class Searching {
    public static boolean exist(int[][] mat,int target){
        int m = mat.length;
        int n = mat[0].length;
        for(int i =0 ; i < m ;i++){
            for(int j =0 ; j < n ;j++){
                if(mat[i][j]== target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int m  = sc.nextInt();
      int n = sc.nextInt();
      int[][] mat = new int[m][n];
      for(int i =0; i < m ;i++){
        for(int j =0 ; j < n ;j++){
            mat[i][j]= sc.nextInt();
        }
      }
      int target = sc.nextInt();
      if(exist(mat,target)){
        System.out.println(target+" exists in matrix");
      }
      else{
        System.out.println(target+" does not exists in matrix");
      }
    }
}
