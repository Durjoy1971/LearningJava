import java.util.Scanner;

public class Tasks {
    public static void main(String[] args)
    {
        // greatest of the three number
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a < b)
        {
            int tmp = b;
            b = a;
            a = tmp;
        }
        if(a < c)
        {
            int tmp = c;
            c = a;
            a = tmp;
        }

        System.out.println("Biggest : " + a);
    }
}
