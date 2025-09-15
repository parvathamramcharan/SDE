//sum of all digits in num recursive
import java.util.*;
public class Sum_of_digits{
    public static int alldigits(int num){
        if(num <=0) return 0;
        return num%10 + alldigits(num/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = alldigits(num);
        System.out.println(result);
    }
}
