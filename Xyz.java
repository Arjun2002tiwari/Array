import java.util.Scanner;
public class Xyz {
    public static boolean search(int a[],int x){
        int mid,r=0;
        int l=a.length-1;
        mid=(r+l)/2;
        while(r<=l){
            if(a[mid]==x){
                return true;
            }
            else if(a[mid]<x){
                r=mid+1;
            }
            else{
                l=mid-1;
            }
            mid=(r+l)/2;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(search(arr,n));
    }
}

