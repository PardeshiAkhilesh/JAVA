import javax.swing.*;
import java.awt.*;

class Blink implements Runnable
{
    JLabel label;
    Blink(JLabel label)
    {
        this.label = label;
    }
    public void run()
    {
        try{
            while(true)
            {
                label.setVisible(true);
                Thread.sleep(500);

                label.setVisible(false);
                Thread.sleep(500);
            }
        } catch(InterruptedException ex)
        {
            System.out.println(ex);
        }
    }
}
public class SLIP4 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Blinked");
        JLabel f1 = new JLabel("Hello The Good Coder",JLabel.CENTER);
        frame.add(f1);
        frame.setSize(400,200);
        frame.setVisible(true);

        Blink g1 = new Blink(f1);
        Thread t1 = new Thread(g1);
        t1.start();
    }
}
