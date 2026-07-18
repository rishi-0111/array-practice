import java.util.*;
class Main{
    public static void main(String[] rishi){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int fm=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>fm){
                sm=fm;
                fm=a[i];
            }
            else if(sm>a[i]&&a[i]!=fm){
                sm=a[i];
            }
        
        }
        System.out.println("First large = "+fm);
        System.out.println("Second large = "+sm);
    }
}
