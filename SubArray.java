public class SubArray {
    /*This approach to find the maximum sum of subarray is 
    basic one.this solution has time complexity of N^3.*/

    static int subArray(int arr[]) {
        int max_sum = 0;
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]);
                    sum = sum + arr[k];
                }

                max_sum = Math.max(max_sum, sum);
                System.out.println();

            }
        }
        return max_sum;
    }

    public static void main(String[] args) {

        int arr[] = { 10, -20, 30, 40, -50, 60 };
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        int res = subArray(arr);
        System.out.println(res);
    }

}
