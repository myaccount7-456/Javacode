import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        int marks;

        System.out.println("enter the marks");
        Scanner s = new Scanner(System.in);
        marks = s.nextInt();
        if (marks > 60 && marks < 100) {
            System.out.println("are good marks");
        }

        else if (marks > 35 && marks < 40) {
            System.out.println("only pass");
        }

        else if (marks > 50 && marks < 80) {
            System.out.println("Medium");
        }

        else {
            System.out.println("x statement,nothing");
        }
    }
}