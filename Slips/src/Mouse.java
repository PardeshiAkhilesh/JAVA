import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    TextField t,t1;
    Label l,l1;
    int x,y;
    Panel p;
    MyFrame(String title)
    {
        super(title);
        setLayout(new FlowLayout());
        p = new Panel();
        p.setLayout(new GridLayout(2,2,5,5));
        t = new TextField(20);
        l = new Label("Co-ordinate of mouse Click");
        l1 = new Label("Co-ordinate of mouse moves");
        t1 = new TextField(20);
        p.add(l);
        p.add(t);
        p.add(l1);
        p.add(t1);
        add(p);
        addMouseListener(new MyClick());
        addMouseMotionListener(new MyMove());
        setSize(500,500);
        setVisible(true);
    }
    class MyClick extends MouseAdapter{
        public void mouseClicked(MouseEvent ae)
        {
            x = ae.getX();
            y = ae.getY();
            t.setText("X= "+x+" Y= "+y);
        }
    }
    class MyMove extends MouseMotionAdapter{
        public void mouseMoved(MouseEvent ae)
        {
            x=ae.getX();
            y=ae.getY();
            t1.setText("X= "+x+" Y= "+y);
        }
    }
}

public class Mouse {
    public static void main(String args[])
    {
        MyFrame f = new MyFrame("Mouse Event");
    }
}
