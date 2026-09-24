import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessDemo {

    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("student.dat", "rw");

            // Write data
            file.writeUTF("Alice");
            file.writeInt(20);

            System.out.println("Data written successfully.");

            // Move pointer to beginning
            file.seek(0);

            // Read data
            String name = file.readUTF();
            int age = file.readInt();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            // Move pointer to a specific position
            System.out.println("Current position: "
                    + file.getFilePointer());

            file.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
