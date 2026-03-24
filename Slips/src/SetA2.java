import java.io.IOException;
import java.util.*;

public class SetA2 {
    public static void main(String args[]) throws IOException
    {
        String name;
        LinkedList<String> l1 = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of friend :- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name :- ");
            name = sc.next();
            l1.add(name);
        }
        System.out.print(l1);
        System.out.println("Enter the name for search :- ");
        String f = sc.next();
        boolean b= l1.contains(f);
        if(b)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
