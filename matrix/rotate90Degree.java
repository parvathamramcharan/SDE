// Rotate Image by 90 degree
// Input:
//  [[1,2,3],[4,5,6],[7,8,9]]
// Output
// : [[7,4,1],[8,5,2],[9,6,3]]
// Explanation:
//  Rotate the matrix simply by 90 degree clockwise and return the matrix.
// 1 2 3   -->   1 4 7  --> 7 4 1
// 4 5 6   -->   2 5 8  --> 8 5 2
// 7 8 9   -->   3 6 9  --> 9 6 3
package matrix;
import java.util.*;
public class rotate90Degree {
    public static void rotate(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i =0 ; i <  m ;i++){
            for(int j = 0 ; j < i ;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        for(int i =0 ; i < m ;i++){
            int start=0;
            int  end = n-1;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]= temp;
                start++;
                end--; 
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i =0 ; i < m ;i++){
            for(int j =0 ; j < n ;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        rotate(arr);
        for(int i =0 ; i < m ;i++){
            for(int j =0 ; j < n ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
