import java.awt.*;
import java.awt.event.*;

class Frame2 extends Frame {
    Label click, move;
    TextField c1, c2;
    int x, y;
    Panel p;

    void mouse() {
        p = new Panel();
        click = new Label("Coordinate of Mouse Click:", Label.CENTER);
        move = new Label("Coordinate of Mouse Move:", Label.RIGHT);

        c1 = new TextField(30);
        c2 = new TextField(30);
        c1.setEditable(false);
        c2.setEditable(false);

        // Add Event Listeners
        p.addMouseListener(new MyClick());
        p.addMouseMotionListener(new MyMove());

        // Add components to panel
        p.add(click);
        p.add(c1);
        p.add(move);
        p.add(c2);

        // Add panel to frame
        add(p);

        setSize(350, 200);
        setTitle("Mouse Motion Tracker");
        setVisible(true);
    }

    // Inner Class for Mouse Click Event
    class MyClick extends MouseAdapter {
        public void mouseClicked(MouseEvent me) {
            x = me.getX();
            y = me.getY();
            c1.setText("X = " + x + "   Y = " + y);
        }
    }

    // Inner Class for Mouse Move Event
    class MyMove extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent me) {
            x = me.getX();
            y = me.getY();
            c2.setText("X = " + x + "   Y = " + y);
        }
    }
}

public class S8_2 {
    public static void main(String[] args) {
        Frame2 f = new Frame2();
        f.mouse();  // ✅ Must call this to display the frame
    }
}
