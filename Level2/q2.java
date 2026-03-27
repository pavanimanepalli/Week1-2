import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Calculate area in sq cm
        double areaCm = 0.5 * base * height;

        // Convert area to sq inches (1 in = 2.54 cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Output result
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        sc.close();
    }
}