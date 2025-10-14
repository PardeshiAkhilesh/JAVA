import java.util.*;

class Cricket{
    int innings,notout,totalrun,bat_avg;
    String name;
    public Cricket(){
        name=null;
        innings=0;
        notout=0;
        totalrun=0;
        bat_avg=0;
    }

    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name,inning,not out,totalrun");
        name = sc.next();
        innings = sc.nextInt();
        notout = sc.nextInt();
        totalrun = sc.nextInt();
    }
    public void put()
    {
        System.out.println("Name"+name);
        System.out.println("Total Inning"+innings);
        System.out.println("Not Out"+notout);
        System.out.println("Total Run"+totalrun);
        System.out.println("Total Bat avg"+bat_avg);
    }

    public void bat_avg(int n,Cricket c[])
    {
        for(int i=0;i<n;i++)
        {
            c[i].bat_avg = c[i].totalrun/c[i].innings;
        }
    }

    public void sort(int n,Cricket c[])
    {
        String temp1;
        int temp2,temp3,temp4,temp5;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(c[i].bat_avg < c[j].bat_avg)
                {
                    temp1 = c[i].name;
                    c[j].name = c[i].name;
                    c[i].name = temp1;

                    temp2 = c[i].innings;
                    c[j].innings = c[i].innings;
                    c[i].innings = temp2;

                    temp3 = c[i].totalrun;
                    c[j].totalrun = c[i].totalrun;
                    c[i].totalrun = temp3;

                    temp4 = c[i].bat_avg;
                    c[j].bat_avg = c[i].bat_avg;
                    c[i].bat_avg = temp4;
                }
            }
        }
    }
}

class CricketPlayer {
    public static void main(String args[])
    {
        System.out.println("How Many Player Your want :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cricket c[] = new Cricket[n];
        for(int i=0;i<n;i++)
        {
            c[i] = new Cricket();
            c[i].get();
        }
    }
}