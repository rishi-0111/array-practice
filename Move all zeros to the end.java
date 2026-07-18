import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]!=0)System.out.print(a[i]+" ");
            
            
            
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==0){
                System.out.print(a[i]+" ");
            }
        }

        

    }
}
