import java.util.*;
import java.io.*;

public class SetA1 {
    public static void main(String args[]) throws IOException{
        String city;
        ArrayList<String> ar = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of cities :- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter CIty name :- ");
            city = sc.next();
            ar.add(city);
        }
        System.out.println("City :- "+ar);
        ar.clear();
        System.out.println(ar);
    }
}
