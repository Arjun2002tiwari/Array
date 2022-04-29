public class Example {
    public static void main(String[] args) {
        
        int arr[]={10,50,30,60,40,20};
        int arr2[]={10,50,30,60,40,20};
        for(int i=0;i<6;i++){
            int min=i;
            for(int j=i+1;j<6;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        int temp,j;
        for(int i=1;i<6;i++){
            temp=arr2[i];
            j=i-1;
            while(j>=0 && arr2[j]>=temp){
                arr2[j+1]=arr2[j];
                j--;
            }
            arr2[j+1]=temp;


        }
        for(int a=0;a<6;a++){
            System.out.print(arr[a]+" ");
        }
        System.out.println("now insertion sort:");

        for(int a=0;a<6;a++){
            System.out.print(arr[a]+" ");
        }
    }
    
}
