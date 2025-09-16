import java.util.*;

public class permutation {
    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive function to generate permutations
    public static void permutate(int[] arr, int start, int end, ArrayList<ArrayList<Integer>> result){
        if(start == end){   // base case: one complete permutation
            ArrayList<Integer> temp = new ArrayList<>();
            for(int num : arr){
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for(int i = start ; i <= end ; i++){
            swap(arr, i, start);  
            permutate(arr, start+1, end, result);
            swap(arr, i, start);  // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permutate(arr, 0, n-1, result);

        // Print all permutations
        for(ArrayList<Integer> perm : result){
            System.out.println(perm);
        }
    }
}
