import java.util.*;
class Main{
    public static void main(String[] rishi){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        System.out.print("Reversed array= ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        
       
    }
}
