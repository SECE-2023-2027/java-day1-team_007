package ram;
import java.util.*;

class Test5{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int n = sc.nextInt();

        System.out.println("Binary number is: "
                + Integer.toBinaryString(n));
    }
}