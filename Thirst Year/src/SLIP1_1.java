import java.io.*;
import java.lang.*;

class AlphaThread extends Thread{
    public void run()
    {
        try{
            for(char ch='a';ch<='z';ch++)
            {
                System.out.println(ch);
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {}
    }
}
public class SLIP1_1 {
    public static void main(String[] args)
    {
        AlphaThread t1 = new AlphaThread();
        t1.start();
    }
}
