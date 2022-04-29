public class PrefixSum {
    /*in this approach we calculate the sum of the original array
    and store it in a new array in the cummulative way
    after that we find the maximum sum of subarray.
    here time complexity is N^2*/

    static int prefix(int arr[], int n) {
        int largest = 0;
        int pre[] = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {// here we find the prefix sum.
            pre[i] = pre[i - 1] + arr[i];
        }
        int sum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i > 0) {
                    sum = pre[j] - pre[i - 1];
                } else {
                    sum = pre[j];
                }
                largest=Math.max(largest, sum);

            }
        }

        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 10, -20, 30, 40, -50, 60 };
        int res=prefix(arr,6);
        System.out.println(res);

    }

}
