import java.util.*;
public class PerpenDegree{
    public static void reversal(int arr[],int start,int end){
        int temp;
         while (start < end) {
             temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
     }
    public static void main(String[] args) {
           
         Scanner sc = new Scanner(System.in);
        
            int T = sc.nextInt();
            
            while(T-- != 0)
            {
                int N = sc.nextInt();
                int D = sc.nextInt();
                int arr[] = new int[N];
                
                for(int i=0;i<N;i++)
                {
                    arr[i] = sc.nextInt();
                }
                reversal(arr,0,D-1);
                reversal(arr,D,N-1);
                reversal(arr,0,N-1);
            
                for(int a:arr)
                {
                   System.out.print(a+" "); 
                }
                
                System.out.println();
            }
           }
        }
