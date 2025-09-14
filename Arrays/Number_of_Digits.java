
// number of digits in  a number(direct formula)
import java.util.*;
public class Number_of_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 123456;
        int digits = (int) (Math.log10(n) + 1);
        System.out.println("Nubmer of digits " + digits);

        //number of digits in b power p
        int b = 3;
        int p = 8;
        System.out.println("b power p : "+(Math.pow(b,p)));
        long nod = (long)(p*Math.log10(b))+1;
        System.out.println("number of digits : "+nod);
    }
}
