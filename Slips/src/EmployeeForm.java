import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChangeColor extends JFrame implements ActionListener {

    JTextField tf;
    JButton btn;

    ChangeColor() {
        setTitle("Change Color Example");
        setSize(300, 150);
        setLayout(new FlowLayout());

        tf = new JTextField(20);
        add(tf);

        btn = new JButton("Make Red");
        btn.addActionListener(this);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setBackground(Color.RED);  // change textfield background
    }

    public static void main(String[] args) {
        new ChangeColor();
    }
}
