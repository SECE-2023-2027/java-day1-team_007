package majid;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int num = sc.nextInt();

        System.out.println("Octal number is: " +
                Integer.toOctalString(num));
    }
}