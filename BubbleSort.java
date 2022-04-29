public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = { 10, 40, 50, 30, 60, 70, 20 };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }

}
