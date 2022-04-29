import java.util.*;
public class Insertionsort3 {
    static void sort(int[] ar){
        for(int i=1;i<ar.length;i++){
            int temp=ar[i];
            int pos=i-1;
            while(pos>=0 && temp<ar[pos]){
                ar[pos+1]=ar[pos];
                pos--;
            }
            ar[pos+1]=temp;
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
        sort(ar);
        
        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]+" ");
        }
    }
}
