import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        int index = 0;

        while(index < 10)
        {
            arr[index] = input.nextInt();
            index++;
        }

        index = 0;
        int sum = 0;

        while(index < 10)
        {
            System.out.println(index + " " + arr[index]);
            sum += arr[index];
            index++;
        }

        System.out.println(sum);

        // 2D Array

        int[][] againArray = new int[3][5];

    }
}