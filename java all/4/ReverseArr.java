import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    static int[] reverse(int b[]){
        int rev[] = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            rev[i] = b[b.length - i -1];
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
	    System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int rev[] = ReverseArr.reverse(arr);
        System.out.println("The array is:" + Arrays.toString(arr));
        System.out.println("The reverse array is:" + Arrays.toString(rev));
        sc.close();
    }
}
