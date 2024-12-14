import java.util.*;

public class PrefixSum {
    static int[] preSum(int[] arr){

        int n = arr.length;
        int[] res = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
          sum += arr[i];
          res[i] = sum;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println(Arrays.toString(preSum(arr)));
    }
}
