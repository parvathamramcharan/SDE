// Spiral Traversal of Matrix
// Input: Matrix[][] = { { 1, 2, 3, 4 },
// 		      { 5, 6, 7, 8 },
// 		      { 9, 10, 11, 12 },
// 	              { 13, 14, 15, 16 } }

// Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
// Explanation: The output of matrix in spiral form.
package matrix;
import java.util.*;     
public class SpiralOrderInMatrix {
     public static ArrayList<Integer> spiral(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        int left = 0;
        int right = n-1;
        int top = 0 ;
        int bottom = m-1;
        while(top <= bottom && left <= right){
             //left to right
             for(int i = left ;i <=right;i++){
                arr.add(mat[top][i]);
             }
             top++;
             //top to bottom
             for(int i = top ; i <= bottom ;i++){
                arr.add(mat[i][right]);
             }
             right--;
             //right to left
             if(top <= bottom){
                for(int i = right ; i >= left;i--){
                    arr.add(mat[bottom][i]);
                }
             }
             bottom--;
             //bottom to top
             if( left <= right){
                for(int i = bottom ; i>= top;i--){
                    arr.add(mat[i][left]);
                }
             }
             left++;
        }
        return arr;
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i =0 ; i  < m ;i++){
            for(int j =0 ; j < n ;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        ArrayList<Integer> res = spiral(mat);
        System.out.println(res);
    }
}
