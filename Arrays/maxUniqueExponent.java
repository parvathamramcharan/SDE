// Input :
// aabbbbeeeeffggg

// Output:
// a2b4e4f2g3

// Input :
// abbccccc

// Output:
// ab2c5
import java.util.*;
public class maxUniqueExponent {
    public static String result(String s){
        LinkedHashMap<Character,Integer> hp = new LinkedHashMap<>();
        for(int  i =0 ; i < s.length();i++){
            char ch = s.charAt(i);
            hp.put(ch,hp.getOrDefault(ch,0 )+1);
        }
        StringBuilder st = new StringBuilder();
        for(Map.Entry<Character,Integer> it : hp.entrySet()){
            st.append(it.getKey());
            st.append(it.getValue());
        }
        return st.toString();
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       System.out.println(result(s));
    }
}
