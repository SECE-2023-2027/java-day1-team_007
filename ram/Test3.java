package ram;
import java.util.*;

class Test3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double radius, area, perimeter;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        area = 3.14 * radius * radius;
        perimeter = 2 * 3.14 * radius;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}