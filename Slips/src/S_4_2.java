import java.awt.*;
import java.awt.event.*;

class InvalidPasswordException extends Exception
{
    InvalidPasswordException()
    {
        System.out.println("Invalid Password And UserNAme");
    }
}

public class S_4_2 extends Frame implements ActionListener {
    Label uname,upass;
    TextField nametext;
    TextField passtext,msg;
    Button login,clear;
    Panel p;
    int attempt=0;
    char c='*';
    public void login()
    {
        p = new Panel();
        uname = new Label("Use Name",Label.CENTER);
        upass = new Label("Password"+Label.RIGHT);
        nametext = new TextField(20);
        passtext = new TextField(20);
        passtext.setEchoChar(c);
        msg = new TextField(10);
        login = new Button("Login");
        clear = new Button("Clear");
        login.addActionListener(this);
        clear.addActionListener(this);
        p.add(uname);
        p.add(nametext);
        p.add(upass);
        p.add(passtext);
        p.add(login);
        p.add(clear);
        p.add(msg);
        add(p);
        setTitle("Hello This is Login PAge");
        setSize(290,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button) ae.getSource();
        if(attempt < 3)
        {
            if(btn.getLabel().equals("Clear"))
            {
                nametext.setText("");
                passtext.setText("");
                msg.setText("");
            }
            if(btn.getLabel().equals("Login"))
            {
                String user= nametext.getText();
                String pass= passtext.getText();
                try{
                    if(user.equals(pass))
                    {
                        msg.setText("Valid");
                    }
                    else {
                        throw new InvalidPasswordException();
                    }
                }
                catch(Exception e) {
                    msg.setText("Error");
                }
                attempt++;
            }
        }
        else{
            System.out.println("You use 3 attempts");
        }
    }
    public static void main(String[] args)
    {
        S_4_2 pd = new S_4_2();
        pd.login();
    }
}
