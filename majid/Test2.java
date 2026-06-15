package majid;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        switch (step) {
            case 1:
                System.out.println(-5+ (8*6));
                break;
            case 2:
                System.out.println((55+9)%9);
                break;
            case 3:
                System.out.println(20+((-3*5)/8));
                break;
            case 4:
                System.out.println(5+(15/3)*2-(8%3));
                break;
            default:
                System.out.println("Invalid step");
        }
    }
}
