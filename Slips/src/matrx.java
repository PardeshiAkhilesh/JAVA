import java.util.*;
public class matrx {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix row and col :- ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Your Matrix");
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Matrix ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+mat[i][j]);
            }
            System.out.println("");
        }
    }
}
