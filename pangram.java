import java.util.*;
class pangram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean arr[]=new boolean[26];
        Arrays.fill(arr,false);
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int idx= (int)c - 97;
            arr[idx] = true;
        }
        int f=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==false)
                {
                    f=1;
                    break;
                }
        }
        if(f==0)
        System.out.println("Pangram string");
        else
        System.out.println("Not Pangram string");
        sc.close();
    }
}