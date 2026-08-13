import java.util.Scanner;

public class Feedback {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] ratings = new double[5];
        double sum = 0;

        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = sc.nextDouble();
            sum = sum + ratings[i];
        }

        double average = sum / 5;

        System.out.println("\nAverage Rating: " + average);

        sc.close();
    }
}