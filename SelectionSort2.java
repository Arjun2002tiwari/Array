public class SelectionSort2 {
    public static void main(String[] args) {
        int arr[] = { 10, 60, 50, 40, 30, 20 };

        for(int i=0;i<5;i++){
            int max=i;
            for(int j=i+1;j<6;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }
    }

}
