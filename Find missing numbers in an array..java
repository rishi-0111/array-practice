import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n-1];
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int op=n*(n+1)/2;
        System.out.print("Missing value: "+ (op-sum));
       
        

    }
}
