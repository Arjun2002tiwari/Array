public class ABC {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int matrix[][]=new int[3][3];

        for(int i=2;i>=0;i--){
            for(int j=0;j<3;j++){
                matrix[2-i][j]=arr[j][i]; 
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=matrix[i][j];
            }  
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println(); 
        }

    }
    
}
