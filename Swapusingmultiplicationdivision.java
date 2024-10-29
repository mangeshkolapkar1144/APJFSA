package Javaprogram;
public class SwapUsingMultiplicationDivision {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without using a third variable
        a = a * b;  // a becomes 48 (6 * 8)
        b = a / b;  // b becomes 6 (48 / 8)
        a = a / b;  // a becomes 8 (48 / 6)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}