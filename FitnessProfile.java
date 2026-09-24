import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessProfile {

    public static void main(String[] args) {

        String profile = "Name: veda\nAge: 20\nWeight: 55 kg\nGoal: Fitness";

        // Write profile data
        try {
            FileOutputStream output = new FileOutputStream("profile.txt");

            byte[] data = profile.getBytes();

            output.write(data);
            output.close();

            System.out.println("Profile written successfully.");

        } catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
        }

        // Read profile data
        try {
            FileInputStream input = new FileInputStream("profile.txt");

            int ch;

            System.out.println("\nUser Profile:");

            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
    }
}
