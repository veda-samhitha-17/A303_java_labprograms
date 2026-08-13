import java.util.Scanner;

public class TrainException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {
                "TR101",
                "TR102",
                "TR103",
                "TR104",
                "TR105"
        };

        System.out.print("Enter train code index (0 to 4): ");
        int index = sc.nextInt();

        try {

            System.out.println("Train Code: " + trainCodes[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid array index.");
            System.out.println("Please enter an index from 0 to 4.");

        }

        sc.close();
    }
}