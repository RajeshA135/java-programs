public class PrintfExample {
    public static void main(String[] args) {
        // Integer values
        int num = 123;
        System.out.printf("Integer (%%d): %d%n", num);

        // Floating-point values
        double pi = 3.14159265359;
        System.out.printf("Floating-point (%%f): %f%n", pi);
        System.out.printf("Floating-point with 2 decimals (%%.2f): %.2f%n", pi);
        System.out.printf("Floating-point with width and precision (%%8.3f): %8.3f%n", pi);

        // Character
        char ch = 'A';
        System.out.printf("Character (%%c): %c%n", ch);

        // String
        String name = "Rajesh";
        System.out.printf("String (%%s): %s%n", name);

        // Boolean
        boolean flag = true;
        System.out.printf("Boolean (%%b): %b%n", flag);

        // Scientific notation
        System.out.printf("Scientific notation (%%e): %e%n", pi);

        // Hexadecimal, Octal, Binary
        int value = 255;
        System.out.printf("Hexadecimal (%%x): %x%n", value);
        System.out.printf("Octal (%%o): %o%n", value);
        System.out.printf("HashCode (%%h): %h%n", name);

        // Positive and negative numbers with + sign
        int positive = 50, negative = -50;
        System.out.printf("Signed positive (%%+d): %+d%n", positive);
        System.out.printf("Signed negative (%%+d): %+d%n", negative);

        // Padding and alignment
        System.out.printf("Right aligned (%%10d): %10d%n", num);
        System.out.printf("Left aligned (%%-10d): %-10d%n", num);
        System.out.printf("Zero padded (%%010d): %010d%n", num);

        // Multiple arguments
        System.out.printf("Name: %s, Age: %d, GPA: %.2f%n", "Rajesh", 22, 8.75);
    }
}
