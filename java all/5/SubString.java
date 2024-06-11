import java.util.Scanner;

class SubString {
    public static void main(String[] args) {
        String a = "This is a test";
        Scanner sc = new Scanner(System.in);
        String subStr = sc.nextLine();
        int pos = a.indexOf(subStr);
        if (pos >= 0) {
            System.out.println("The substring is found in index " + pos);
        } else {
            System.out.println("Can not found the substring");
        }
        sc.close();
    }
}
