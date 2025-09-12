package matrix;
import java.util.*;
public class uniqueRows {
    public static ArrayList<ArrayList<Integer>> result(int[][] mat){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int  rows = mat.length;
        int cols = mat[0].length;
        for(int i  =0 ; i < rows;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j =0 ; j < cols;j++){
                arr.add(mat[i][j]);
            }
            if(!res.contains(arr)){
                res.add(arr);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i  =0 ;i < m ;i++){
            for(int j =0 ;j < n ;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> res = result(mat);
        System.out.println(res);
    }
}
