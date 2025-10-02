import java.util.*;
public class seta3 {
    public static void main(String args[])
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("1] Volume of Cylindric");
        System.out.println("2] Factorial of number");
        System.out.println("3] Number is Armstrong or not");
        System.out.println("4] Exit");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                float h,r,v;
                final float PI = 3.14F;
                System.out.println("Enter Radius and height = ");
                r = sc.nextFloat();
                h = sc.nextFloat();
                v = PI*r*r*h;
                System.out.println("Volume = "+v);
                break;
            case 2:
                long f=1;
                int no;
                System.out.println("Enter Number :- ");
                no = sc.nextInt();
                while(no>1)
                {
                    f = f*no;
                    no--;
                }
                System.out.println("Factorial of a given number is"+f);
                break;
            case 3:
                long num,sum=0,t;
                System.out.println("Enter number");
                num = sc.nextInt();
                for(t=num;t !=0; t=t/10)
                {
                    sum = sum + (t%10) * (t%10) * (t%10);
                }
                if(num == sum)
                {
                    System.out.println("Number is armstrong");
                }
                else {
                    System.out.println("Number is not armstrong");
                }
                break;
            case 4:
                System.out.println("Thank you for comming");
                break;
        }
    }
}
