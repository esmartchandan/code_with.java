import java.util.*;
public class Functions {
    public static int calculateProduct(int a, int b){
 int sum = a + b;
 return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum  = calculateProduct(a,b);
        System.out.print("product of 2 number is "+ sum);
}
}
