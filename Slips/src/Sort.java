import java.util.*;
public class Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of string:- ");
        int n = sc.nextInt();
        sc.nextLine();

        String s[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter Name ["+i+"] = ");
            s[i] = sc.nextLine();
        }

        //sort
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(s[j-1].compareTo(s[j])>0)
                {
                    String temp=s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }
            }
        }

        System.out.println("\n Sortest names are in Ascending Order = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
