import java.util.Scanner;
class Calculator2 {
    static void sum(double a, double b){
        double c = a + b;
        String ans = String.format("%.2f", c);
        System.out.println("\n"+a + " + " + b + " = " + ans);
    }
    static void sub(double a, double b){
        double c = a - b;
        String ans = String.format("%.2f", c);
        System.out.println(a + " - " + b + " = " + ans);
    }
    static void multiply(double a, double b){
        double c = a * b;
        String ans = String.format("%.2f", c);
        System.out.println(a + " x " + b + " = " + ans);
    }
    static void divide(double a, double b){
        double c = a / b;
        String ans = String.format("%.2f", c);
        System.out.println(a + " / " + b + " = " + ans+"\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        Calculator2.sum(x,y);
        Calculator2.sub(x,y);
        Calculator2.multiply(x,y);
        Calculator2.divide(x,y);
        sc.close();
    }
}
