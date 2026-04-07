import java.io.*;
import java.lang.*;
class MyThread1 extends Thread{
    public void run()
    {
        try{
            for(int i=0;i<100;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie)
        {}
    }
}
public class Ass2 {
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        System.out.println(Thread.currentThread().getName());
        t1.setName("Akhilesh");
        t1.start();
        System.out.println("New Tread namw: "+t1.getName());
    }
}
