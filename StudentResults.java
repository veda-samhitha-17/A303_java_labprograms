import java.util.Scanner;
class Student {
    protected int rollNo;
    protected String name;
    public void getStudentDetails(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
    public void displayStudentDetails() {
        System.out.println("\n--- Student Result Summary ---");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
    }
}
class Marks extends Student {
    protected int[] marks = new int[5];
    public void getMarks(Scanner sc) {
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
    public void displayMarks() {
        System.out.print("Marks       : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
class Result extends Marks {
    private int total;
    private double average;
    private char grade;
    public void calculateResult() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5.0;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
    public void displayResult() {
        displayStudentDetails();
        displayMarks();
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Average     : " + String.format("%.2f", average));
        System.out.println("Grade       : " + grade);
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result studentResult = new Result();
        studentResult.getStudentDetails(sc);
        studentResult.getMarks(sc);
        studentResult.calculateResult();
        studentResult.displayResult();
        sc.close();
    }
}
