public class QuickSort2 {

    static int partition(int arr[], int low, int high) {

        int pivot = arr[0];
        int i = low;
        int j = high;
        while (i < j) {//iterrate until the end cross the start.
            do {
                i++;
            } while (arr[i] <= pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                int temp = arr[i];//if less than or grater than pivot
                                  //is found swap them.
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];/*when end or start cross each other 
        swap the pivot with end value*/
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quicksort(int arr[], int low, int high) {

        if (low < high) {
            int j = partition(arr, low, high);/*use the quicksort 
            code recurrsively.*/
            quicksort(arr, low, j);
            quicksort(arr, j + 1, high);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 10, 40, 60, 50, 20, 30 };

        int low = 0;
        int high = 6;

        quicksort(arr, low, high);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}