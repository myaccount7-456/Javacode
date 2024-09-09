class ternary {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;

        int y = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(y);

    }
}