import java.util.*;

abstract class Staff1
{
    protected int id;
    protected String name;

    Staff1(int id,String name)
    {
        this.id = id;
        this.name = name;
    }

    abstract public void display();
}

class OfficeStaff extends Staff1
{
    String dept;

    OfficeStaff(int id,String name,String dept)
    {
        super(id,name);
        this.dept = dept;
    }

    public void display()
    {
        System.out.println("\t|\t" +id+ "\t\t" +name+ "\t\t" +dept);
        System.out.println("--------------------------");
    }
}

public class Staff {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Staff you want");
        int n = sc.nextInt();
        OfficeStaff s[] = new OfficeStaff[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter" + (i+1) + "number of employee details :-\n");
            System.out.println("Enter Id");

            int id = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter Departemnt");
            String dept = sc.next();

            s[i] = new OfficeStaff(id,name,dept);
        }
        System.out.println("\t\t\t\t Employee Details");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t|\tID\t\tName\t\tDept\t\t|");
        System.out.println("------------------------------------------------------------------------");
        for(int i=0;i<n;i++)
        {
            s[i].display();
        }
        sc.close();
    }
}
