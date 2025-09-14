//gcd and lcm of two numbers
import java.util.*;
public class gcd_lcm {
    public static int result1(int num1,int num2){
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1-num2;
            }
            else{
                num2= num2-num1;
            }
        }
        return num1;
    }
    public static int result2(int num1,int num2){
        int res = result1(num1, num2);
        return (num1*num2)/res;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = result1(num1,num2);
        int lcm = result2(num1,num2);
        System.out.println("gcd : "+gcd+ " and lcm :"+lcm);
    }
}
