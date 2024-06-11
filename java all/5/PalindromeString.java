import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String a = sc.nextLine();
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("It is a palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }
        sc.close();
    }
}
