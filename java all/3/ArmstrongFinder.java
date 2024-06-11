import java.util.Scanner;

class ArmstrongFinder {
    public static void main(String[] args) {
        int n;
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range: ");
        n = sc.nextInt();
        for (int i =10;i<=n;i++) {
            int len = String.valueOf(i).length();
            int temp = i;
            num=0;
            while(temp !=0){
                int digit = temp % 10;
                num = num + (int) Math.pow(digit, len);
                temp = temp/10;
            }
            if (i==num) {
                System.out.print(i+", ");
            }
        }
        System.out.println("");
        sc.close();
    }
}