package majid;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Input the second number: ");
        int n2 = sc.nextInt();

        System.out.print("Input the third number: ");
        int n3 = sc.nextInt();

        boolean result =
                (n1 % 10 == n2 % 10) ||
                (n1 % 10 == n3 % 10) ||
                (n2 % 10 == n3 % 10);

        System.out.println("The result is: " + result);
    }
}