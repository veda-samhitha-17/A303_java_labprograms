import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");

        System.out.println("First name: " + name1);
        System.out.println("Second name: " + name2);

        System.out.println("Length of first name: " + name1.length());
        System.out.println("Length of second name: " + name2.length());

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both names are same.");
        } else {
            System.out.println("Both names are different.");
        }

        System.out.println("First name in uppercase: " + name1.toUpperCase());
        System.out.println("Second name in lowercase: " + name2.toLowerCase());

        sc.close();
    }

}
