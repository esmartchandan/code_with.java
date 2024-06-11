import java.util.Scanner;
class SumAverage{
    static int sum(int arr[]){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
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
        int s = SumAverage.sum(arr);
        double avg = (double) s / (double) n;
        System.out.println("The sum is " + s + "\nThe average is " + avg);
        sc.close();
    }
}