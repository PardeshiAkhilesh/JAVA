import java.util.*;
import java.io.*;
class CovidException extends Exception
{
    public CovidException()
    {
        System.out.println("This person have covid");
    }
}

class Covid
{
    String name;
    int age;
    double oxy,hrct;
    public Covid(String name,int age,double oxy,double hrct)
    {
        this.name = name;
        this.age = age;
        this.oxy = oxy;
        this.hrct = hrct;
    }

    public static void main(String[] args) throws IOException
    {
        String name;
        int age;
        double oxy,hrct;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :- ");
        name = sc.next();
        System.out.println("Enter Age :- ");
        age = sc.nextInt();
        System.out.println("Enter Oxygen level :- ");
        oxy = sc.nextDouble();
        System.out.println("Enter HRCT :- ");
        hrct = sc.nextDouble();

        Covid c = new Covid(name,age,oxy,hrct);
        try
        {
            if (c.oxy < 95 || c.hrct > 10) {
                throw new CovidException();
            }
            else
                System.out.println("PerSon Info \n"+"Name ="+name+"Age ="+age+"Oxygen"+oxy+"HRCT"+hrct);
        }catch (CovidException e)
        {

        }
    }
}
