public class MyRectangle {
    int length;
    int breath;
    MyRectangle(int a,int b)
    {
        System.out.println("NEW PARAMETERS");
        length = a;
        breath = b;
    }
    int area()
    {
        return length * breath;
    }
    int perimeter()
    {
        return 2 * (length + breath);
    }
    public static void main(String args[])
    {
        MyRectangle r1 = new MyRectangle(10,20);
        System.out.println("Area Of rectangle" + r1.area());
        System.out.println("Paremeter of retangle" + r1.perimeter());
    }
}
