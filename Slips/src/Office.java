import java.util.*;

abstract class Staff
{
    protected int id;
    protected String name;
    public Staff(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}


class Office extends Staff {
    String dept;

    Office(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }

    public void display()
    {
        System.out.println("ID"+id+"Name"+name+"Dept"+dept);
    }

    public static void main(String[] args) {
        System.out.println("Enter How many Staaff you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Office ob[] = new Office[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Id,name,Department");
            int id = sc.nextInt();
            String name = sc.next();
            String dept = sc.next();
            ob[i] = new Office(id, name, dept);
        }
        System.out.println("Enter Data :-");
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
    }
}
