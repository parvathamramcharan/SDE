import java.util.*;

public class Swap_With_Temp_WithoutTemp {
    public static void main(String[] args) {
        // 1. swapping woth temp variable
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " b : " + b);

        //2.swapping without temp
         int m = 10;
         int n = 20;
         m = m+n ; // 10+20 = 30
         n = m-n; //30-20 = 10
         m  = m-n; //30-10= 20
         System.out.println("m : "+ m + " n : "+ n);
    }
}
