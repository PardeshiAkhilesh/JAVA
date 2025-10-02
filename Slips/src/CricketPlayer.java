import java.io.IOException;
import java.util.*;
import java.io.*;
class Cricket
{
    String name;
    int innings,notout,totalruns,bat_avg;
    public Cricket()
    {
        name=null;
        innings=0;
        notout=0;
        totalruns=0;
        bat_avg=0;
    }
    public void get() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name,innings,no of time not out,totalrun");
        name = br.readLine();
        innings = Integer.parseInt(br.readLine());
        notout = Integer.parseInt(br.readLine());
        totalruns = Integer.parseInt(br.readLine());
    }
    static void avg(int n,Cricket c[])
    {
        for(int i=0;i<n;i++)
        {
            c[i].bat_avg = c[i].totalruns/c[i].innings;
        }
    }

    static void sort(int n,Cricket c[])
    {
        String temp1;
        int temp2,temp3,temp4,temp5;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(c[i].bat_avg<c[j].bat_avg)
                {
                    temp1 = c[i].name;
                    c[i].name = c[j].name;
                    c[j].name = temp1;

                    temp2 = c[i].innings;
                    c[i].innings = c[j].innings;
                    c[j].innings = temp2;

                    temp3 = c[i].totalruns;
                    c[i].totalruns = c[j].totalruns;
                    c[j].totalruns = temp3;

                    temp4 = c[i].notout;
                    c[i].notout = c[j].notout;
                    c[j].notout = temp4;

                    temp5 = c[i].bat_avg;
                    c[i].bat_avg = c[j].bat_avg;
                    c[j].bat_avg = temp5;
                }
            }
        }
    }

    public void put()
    {
        System.out.println("Name = "+name);
        System.out.println("no of innings = "+innings);
        System.out.println(("no of times not out"+notout));
        System.out.println("Total Run"+totalruns);
        System.out.println("Bat avg"+bat_avg);
    }
}


public class CricketPlayer {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limits");
        int n = sc.nextInt();
        Cricket c[] = new Cricket[n];
        for(int i=0;i<n;i++)
        {
            c[i] = new Cricket();
            c[i].get();
        }
        Cricket.avg(n,c);
        Cricket.sort(n,c);
        for(int i=0;i<n;i++)
        {
            c[i].put();
        }
    }
}
