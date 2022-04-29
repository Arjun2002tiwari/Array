public class Kadane {
    /*this algoritm is for reducing time compelxity
    to N.*/

    static int max(int arr[], int n) {

        int cs = 0;
        int largest = 0;
        for (int i = 0; i < n; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            largest = Math.max(largest, cs);
        }
        return largest;

    }

    public static void main(String[] args) {

        int arr[] = { 10, -20, 30, 40, -50, 60 };
        int n = 6;
        int res = max(arr, n);
        System.out.println(res);

    }

}
