import java.util.*;
public class shuffle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {   
            int idx=rd.nextInt(n);
            int temp = arr[idx];
            arr[idx] =arr[i];
            arr[i]=temp;
          
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();    
    }
}
