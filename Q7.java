interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Display implements Printable, Showable {

    public void print() {
        System.out.println("Printing details...");
    }

    public void show() {
        System.out.println("Showing details...");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Display obj = new Display();

        obj.print();
        obj.show();
    }
}