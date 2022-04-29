public class SelectionSort {
    public static void main(String[] args) {
    
        int arr[] = { 10, 60, 50, 40, 30, 20 };
        for (int i = 0; i < 5; i++) {
            int min = i;
            for (int j = i + 1; j < 6; j++) {

                if (arr[min] > arr[j]) {// here we found the minimum value
                    min = j; // from the entire array.

                }

            }
            int temp = arr[i];/*
                               * here we swap the first index with the
                               * minimum value in the array.
                               */
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }
}
