import java.io.*;
class Continent
{
    String con;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void con_input() throws IOException
    {
        System.out.println("Enter Continent Name: ");
        con = br.readLine();
    }
}
class Country extends Continent
{
    String cou ;
    void cou_input() throws IOException
    {
        System.out.println("Enter Country Name: ");
        cou = br.readLine();
    }
}
class State extends Country
{
    String sta,pla;
    void sta_input() throws IOException
    {
        System.out.println("Enter State Name: ");
        sta = br.readLine();
        System.out.println("Enter place Name: ");
        pla = br.readLine();
    }
}
class Ass3A1
{

    public static void main(String[] args)throws IOException
    {
        State s = new State();
        s.con_input();
        s.cou_input();
        s.sta_input();
        System.out.println("\n\nContinent: "+s.con);
        System.out.println("Country: "+s.cou);
        System.out.println("State: "+s.sta);
        System.out.println("State: "+s.pla);

    }

}