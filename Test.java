import java.util.Scanner;

/**
 *
 * @author Maxim
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = scanner.nextInt();
        System.out.println("Hexadecimal "+Integer.toHexString(num));
    }
}
