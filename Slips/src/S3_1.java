import java.util.*;
public class S3_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of cictes");
        int n = sc.nextInt();
        String name[] = new String[n];
        System.out.println("Print Yur Cites Name :- ");
        for(int i=0;i<n;i++)
        {
            name[i] = sc.next();
        }
        String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if((name[j-1].compareTo(name[j]))>0)
                {
                    temp = name[j-1];
                    name[j-1] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("In Assending Order :- ");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]);
        }
    }
}
