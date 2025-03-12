public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM: " + lcm);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}