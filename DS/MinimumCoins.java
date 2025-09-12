package DS;
// coins[] = { 2000,1000 ,500,200,100 ,50 ,20 ,5,2,1};
import java.util.*;
public class MinimumCoins {
    public static ArrayList<Integer> result(int num){
        ArrayList<Integer> arr  = new ArrayList<>();
        int[] coins = { 2000,1000,500,200,100,50,20,5,2,1};
        int sum = num;
        int i =0;
        while( sum >= 0 && i < coins.length){
            if( sum >= coins[i]){
                sum = sum -coins[i];
                arr.add(coins[i]);
            }else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = result(n);
        for(int  i : res){
            System.out.print(i+" ");
        }
    }
}
