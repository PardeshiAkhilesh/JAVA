import java.awt.*;
import java.awt.event.*;

class InvalidPass extends Exception
{
    InvalidPass()
    {
        System.out.println("User and Pass Are not same");
    }
}

class S4_2 extends Frame implements ActionListener{
    Label uname,pass;
    TextField nametext,passtext,msg;
    Panel p;
    Button login,clear;
    int att = 0;
    char ch = '*';
    public void login()
    {
        p = new Panel();
        uname = new Label("User Name",Label.CENTER);
        pass = new Label("Password",Label.RIGHT);
        nametext = new TextField(20);
        passtext = new TextField(20);
        passtext.setEchoChar('*');
        login = new Button("Login");
        clear = new Button("Clear");
        msg = new TextField(20);
        login.addActionListener(this);
        clear.addActionListener(this);
        p.add(uname);
        p.add(nametext);
        p.add(pass);
        p.add(passtext);
        p.add(msg);
        p.add(login);
        p.add(clear);
        add(p);
        setTitle("Login");
        setSize(290,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button)(ae.getSource());
        if(att<3)
        {
            if((btn.getLabel())=="Clear")
            {
                nametext.setText("");
                passtext.setText("");
            }
            if((btn.getLabel())=="Login")
            {
                try{
                    String user = nametext.getText();
                    String pass = passtext.getText();
                    if(user.compareTo(pass)==0)
                    {
                        msg.setText("Valide");
                    }
                    else{
                        throw new InvalidPass();
                    }
                }catch(Exception e)
                {
                    msg.setText("Error");
                }
                att++;
            }
        }
        else {
            System.out.println("Attemept are Falis");
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        S4_2 ob= new S4_2();
        ob.login();
    }
}