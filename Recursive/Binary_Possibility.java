//binary possibilties of number
//Tske input N and print all possibilities of 0s and 1s in ascending order
import java.util.*;
public class  Binary_Possibility{
    public static void binary(String s,int num){
        if(num == 0) System.out.print(s+" ");
        else{
           binary(s+'0', num-1); // possibility with 0
            binary(s+'1', num-1); //possibilty with 1
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        binary("",num);
    }
}

// 4 => 0000 ,0001 ,0010,0100, 0101,0110,0111,1000,1001,1101,1100,1111;
