import java.util.*;
class Main{
    public static void main(String[] rishi){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            
                if(a[i]!=a[j]){
                    j++;
                    a[j]=a[i];
                }
                
            }
            for(int i=0;i<=j;i++){
                System.out.print(a[i]+" ");
            }
        
    }
}






//  Remove duplicates from a sorted array using TreeSet
import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
      TreeSet<Integer>t=new TreeSet<>();
      for(int i=0;i<n;i++)
      {
          t.add(sc.nextInt());
      }
      for(int e:t)
      {
      System.out.print(e+" ");
      }
        
    }
}
