import java.util.*;
import java.io.*;

public class SetA1 {
    public static void main(String args[]) throws IOException
    {
        String city;
        ArrayList<String> a1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cities :- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter City Name :- ");
            city = sc.next();
            a1.add(city);
        }
        System.out.println(a1);
        a1.clear();
        System.out.println("After Remove :- "+a1);
    }
}
