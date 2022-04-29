public class InsertionSort2 {
    public static void main(String[] args) {

        int temp,j;
        int arr[]={10,50,30,60,40,20};

        for(int i=1;i<6;i++){
            temp=arr[i];
            j=i-1;

            while(j>=0 && arr[j]<=temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            
        }
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
