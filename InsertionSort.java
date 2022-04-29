public class InsertionSort {
    public static void main(String[] args) {

        int temp,pos;

        int arr[] = { 10, 60, 50, 40, 30, 20 };
        
        for (int i = 1; i < 6; i++) {
           temp=arr[i];
           pos=i-1;

           while(pos>=0 && arr[pos]>=temp){
               arr[pos+1]=arr[pos];
               pos=pos-1;
           }
           arr[pos+1]=temp;

        }
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }

    }
}