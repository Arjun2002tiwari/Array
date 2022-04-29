public class Infosys {
    public static void main(String[] args) {
        int n=3,k=20;
        int ar[]={1,8,1};
        int sum=0;
        int count=1;
        for(int i=0;i<n;i++){
             sum=(sum+ar[i])*count;
            count++;
            if(sum>=k){
                count=count-1;
                System.out.println(count);
                break;
            }
        }
    
    }
}
