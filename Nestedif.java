class Nested_if {
    public static void main(String[] args) {

        int a = 100, b = 20, c = 3;
        if (a > b) {
            if (a > c) {
                System.out.println("maximum");
            } else {
                System.out.println("not maximum ");
            }

        } else {
            if (b > a) {
                System.out.println("maximum number");
            } else {
                System.out.println("least no");

            }
        }

    }
}