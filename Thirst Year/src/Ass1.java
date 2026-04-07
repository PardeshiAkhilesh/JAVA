import java.io.*;
import java.lang.*;
class MyThread extends Thread
{
    String message;
    int n;
    MyThread(String message,int n) throws Exception
    {
        this.message = message;
        this.n = n;
        start();
        join();
    }
    public void run()
    {
        try{
            for(int i=0;i<n;i++)
            {
                System.out.println(message+": "+i+"Timesa");
                Thread.sleep(200);
            }
        }catch (InterruptedException ie){}
    }
}
public class Ass1 {
    public static void main(String[] args) throws Exception{
        MyThread t1 = new MyThread("Covid 16",10);
        System.out.println(t1);
        MyThread t2 = new MyThread("LOCKDOWN",4);
    }
}
