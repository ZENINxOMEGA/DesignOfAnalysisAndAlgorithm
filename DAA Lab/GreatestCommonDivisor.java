public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + result);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
