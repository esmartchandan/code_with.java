import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            sc.close();
            if (a % b == 0) {
                System.out.println(a + " is divisible by " + b);
            } else {
                System.out.println(a + " is not divisible by " + b);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception:: Can't divide by zero "+ e);
        } catch (InputMismatchException e) {
            System.out.println("Exception:: Wrong input");
        }
    }
}