package majid;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        switch (step) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
                break;
            default:
                System.out.println("Invalid step");
        }
    }
}
