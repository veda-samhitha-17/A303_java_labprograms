import java.util.Scanner;

public class PredefinedException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        String input = sc.nextLine();

        try {

            int age = Integer.parseInt(input);

            System.out.println("Age: " + age);

            int result = 100 / (age - age);

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException: Please enter a valid number.");

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException: Cannot divide by zero.");

        }

        sc.close();
    }
}