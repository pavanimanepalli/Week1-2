import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert to square inches
        double areaInch = areaCm / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq cm is " + areaCm);
        System.out.println("The Area of the triangle in sq in is " + areaInch);

        sc.close();
    }
}

