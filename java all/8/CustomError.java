import java.util.Scanner;

class NegativeAgeException extends Exception {
    NegativeAgeException(String str) {
        super(str);
    }
}

public class CustomError {
    static void validate(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age can't be negative");
        } else if (age < 18) {
            System.out.println("Invalid age");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.close();
            validate(age);
        } catch (NegativeAgeException e) {
            System.out.println("Exception:: age can't be negative");19
            
        }
    }
}

