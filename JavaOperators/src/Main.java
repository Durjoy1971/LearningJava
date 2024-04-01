import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Perimeter of a rectangle
        /*
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println(a+b+c+d);
         */

        // Convert Fahrenheit to Celsius
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();
        System.out.println("F to C : " + (F-32)*((5*1.00)/9));

    }
}