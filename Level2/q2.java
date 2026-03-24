import java.util.Scanner;

public class q2_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Print the results
        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and in sq cm is " + areaCm);
    }
}