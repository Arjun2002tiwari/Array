import java.util.Scanner;

/*
In binary searching algorithm,
we eliminate the unwanted searching.to
achive this,we use three variables:start,middle,end.
in this type of sorting we first decide the range in which 
our value will be lie between.
the we search only in that particular region
not in the whole array.
IT IS APPLICALE ONLY IN SORTED ARRAY.
IT IS APPLICABLE ONLY IN NON-DECREASING 
AND NON-INCREASING ARRAY.
*/
class BinarySearch {
    static int FindVar(int arr[], int n, int key) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;// here,we shift the end from last to middle point.
            } else if (arr[mid] < key) {
                s = mid + 1;// here,we shift the start to the midddle +1 point.
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int res = FindVar(arr, n, key);

        if (res != -1) {
            System.out.println("The index of " + key + " is " + res);
        } else {
            System.out.println("Key not Found!");
        }
    }

}
