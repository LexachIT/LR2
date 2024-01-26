import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X: ");
        double x = in.nextInt();
        System.out.println("Введите N: ");
        int n = in.nextInt();
            double sum = 0;
        for (int i = 0; i < n; i++) {
            double value = (2*n + 1);
            double factor = factorial(value);
            sum += ((Math.pow(-1, n) * Math.pow(x, 2 * n)) / factor);
        }
            System.out.println("Summ: " + sum);
    }
    public static double factorial(double num)
    {
        double fact = 1;

        for (double i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }
    }


