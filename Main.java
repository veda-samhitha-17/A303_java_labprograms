class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    Marks(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }
}

class Result extends Marks {

    Result(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    void calculateResult() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';

        displayStudent();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {

        Result r = new Result(101, "Arun", 85, 90, 78, 88, 92);

        r.calculateResult();
    }
}