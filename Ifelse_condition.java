import java.util.Scanner;

public class Ifelse_condition {
    public static void main(String args[]) {
        int pwd;
        System.out.println("enter a password");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();

        if (pwd == 123) {
            System.out.println("manoj");
            System.out.println("manojreddy_007");
        } else {
            System.out.println("sorry! false condition");
        }

    }

}
