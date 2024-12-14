public class MaxSubarraySum {

    static int maxSubSum(int[] arr){
        int ans = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int[] res = new int[n];
        res[0] = arr[0];
        // int sum = 0;
        for(int i = 1; i < n; i++){
        //   sum += arr[i];
        //   res[i] = sum;
        res[i] = res[i-1] + arr[i];
        }
        int currentSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currentSum = start == 0 ? res[end] : res[end] - res[start - 1];
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    static int kadane(int[] arr){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            if(currentSum > maxSum)
                 maxSum = currentSum;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println(maxSubSum(arr));
        System.out.println(kadane(arr));
    }
}
