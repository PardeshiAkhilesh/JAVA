import java.util.*;

public class S2_2 {
    String name;
    int innings,notout,totalrun;
    int avg;
    public S2_2()
    {
        name = null;
        innings=0;
        notout = 0;
        totalrun = 0;
        avg=0;
    }
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,inning,notout,totalrun");
        name = sc.next();
        innings = sc.nextInt();
        notout = sc.nextInt();
        totalrun = sc.nextInt();
    }
    public void put()
    {
        System.out.println("Name "+name+"Inning "+innings+"Not Out "+notout+"totalrun "+totalrun);
    }

    static void avg(int n,S2_2 c[])
    {
        for(int i=0;i<n;i++)
        {
            c[i].avg = c[i].totalrun/c[i].innings;
        }
    }

    static void sort(int n,S2_2 c[])
    {
        String temp1;
        int temp2,temp3,temp4;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(c[i].avg < c[j].avg)
                {
                    temp1 = c[i].name;
                    c[i].name = c[j].name;
                    c[j].name = temp1;

                    temp2 = c[i].avg;
                    c[i].avg = c[j].avg;
                    c[j].avg = temp2;

                    temp3= c[i].innings;
                    c[i].innings = c[j].innings;
                    c[j].innings = temp3;

                    temp4 = c[i].notout;
                    c[i].notout = c[j].notout;
                    c[j].notout = temp4;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter crickter :- ");
        int n = sc.nextInt();
        S2_2 ob[] = new S2_2[n];
        for(int i=0;i<n;i++)
        {
            ob[i] = new S2_2();
            ob[i].get();
        }
        S2_2.avg(n,ob);
        S2_2.sort(n,ob);
        for(int i=0;i<n;i++)
        {
            ob[i].put();
        }
    }
}
