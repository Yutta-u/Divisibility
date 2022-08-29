import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int x = a % b;
        int x1 = b % a;

        if (x == 0) {
            System.out.println("1");
        } else if (x1 == 0) {
            System.out.println("1");
        } else {
            System.out.println("666");
        }
    }
}
