//prime numbers of given range
import java.util.*;
public class PrimeNumbers {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num <= 3){
            return true;
        }
        if(num%2==0 || num%3==0){
            return false;
        }
        for(int i  = 5; i <= Math.sqrt(num);i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the range to check prime numbers");
        int num1  = scanner.nextInt();
        int num2  = scanner.nextInt();
        for(int i = num1;i <= num2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
