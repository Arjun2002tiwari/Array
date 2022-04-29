public class QuickSort {
    static int partition(int arr[],int lp,int up){
        int start=lp;
        int end=up;

        int pivot = arr[end];  // pivot element 
        int i = (start - 1);  
      
        for (int j = start; j <= end - 1; j++)  
        {  
            // If current element is smaller than the pivot  
            if (arr[j] < pivot)  
            {  
                i++; // increment index of smaller element  
                int t = arr[i];  
                arr[i] = arr[j];  
                arr[j] = t;  
            }  
         } 
        int t = arr[i+1];  
        arr[i+1] = arr[end];  
        arr[end] = t;  
        return (i + 1);  
    }  
    static void quicksort(int arr[],int lp,int up){
        if(lp<up){
            int loc=partition(arr, lp, up);
            quicksort(arr, lp, loc-1);
            quicksort(arr, loc+1, up);
        }
    }
    public static void main(String[] args) {
    
        int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 4};
        int lp=0;
        int up=8;
        //partition(arr, lp, up);
        quicksort(arr, lp, up);

    for(int i=0;i<9;i++){
        System.out.print(arr[i]+" ");
    }

    }

}
