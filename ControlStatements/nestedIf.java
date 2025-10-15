public class nestedIf {
    public static void main(String[] args) {
        int age = 25;
        int weight = 60;
        if (age >= 18) {  // outer if
            if (weight > 50) {  // inner if
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood (underweight)");
            }
        } else {
            System.out.println("You are not eligible to donate blood (underage)");
        }
    }
}
