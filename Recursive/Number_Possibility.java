//genarate all the strings of llength n , from 0.......k -1
// length of number  :  n
//limit for digits   :  k ( 1 to 9)
//ex n = 3 , k = 8 (range 1 to 888)
//output : 111,112,113,.......887,888

//ex2 : n =2 , k =4 (range 1 to 4)
//output : 11,12,13,14,21,22,23,24,21,32,33,34,41,42,43,44
import java.util.*;
public class Number_Possibility {
    public static void recur(String s,int n ,int r){
         if(n==0) System.out.print(s+" ");
         else{
            for(int i =1 ; i <=r ;i++ ){
                recur(s+i, n-1, r);
            }
         }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        recur("",n,r);


    }
}
