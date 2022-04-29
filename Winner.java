import java.util.Scanner;

public class Winner {
    static void winner1(String arr[],int n){

        for (int k = 1; k < n; k++) {
            int count = 0;
            for (int l = k - 1; l >= 0; l--) {
                if (arr[k].equals(arr[l])) {
                    count++;  
                }
            }
            if(count!=0){
                System.out.print(arr[k] + count + " ");
                }
            
            if(count==0){
            System.out.print("verified ");
            }

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int freq = sc.nextInt();
        for (int i = 0; i < freq; i++) {

            int n = sc.nextInt();
            String arr[] = new String[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.next();
            }

            System.out.print("verified ");

            winner1(arr, n);
        }

    }
}
