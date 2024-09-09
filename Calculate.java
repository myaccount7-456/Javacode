import java.util.Scanner;

class Calculate {
    public static void main(String args[]) {

        int a, b, c, ch;

        System.out.println("enter any two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("choose operator");
        ch = sc.nextInt();

        switch (ch) {
            case "1":
                c = a + b;
                System.out.println("the addition" + c);
                break;

            case "2":
                c = a - b;
                System.out.println("the subtraction" + c);
                break;

            case "3":
                c = a * b;
                System.out.println("the multiplication" + c);
                break;

            case "4":
                c = a / b;
                System.out.println("the division" + c);
                break;

            default:
                System.out.println("INVALID STATEMENT");

        }
    }
}