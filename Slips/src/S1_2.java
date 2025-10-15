import java.util.*;

abstract class Staff1{
    protected int id;
    protected String name;
    public Staff1(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}

public class S1_2 extends Staff1{
    String dept;
    S1_2(int id,String name,String dept)
    {
        super(id,name);
        this.dept = dept;
    }
    void display()
    {
        System.out.println("Id "+id+"Name "+name+"Dept "+dept);
    }
    public static void main(String[] args)
    {
        int id;
        String name,dept;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How Many Office Staff You want :- ");
        n = sc.nextInt();
        S1_2 ob[] = new S1_2[n];
        System.out.println("Enter details of Office Staff");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id.name,dept");
            id = sc.nextInt();
            name = sc.next();
            dept = sc.next();
            ob[i] = new S1_2(id,name,dept);
        }
        System.out.println("Details");
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
    }
}
