import java.util.Scanner;

class LinearSearch {
    static int search(int arr[], int term) {
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if (term == arr[i]) {
                found = i;
            }
        }
        return found;
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
        System.out.print("Enter the element you want to search: ");
        int term = sc.nextInt();
        int found = LinearSearch.search(arr, term);
        if (found >= 0) {
            System.out.println("The element is found in the index: " + found);
        } else {
            System.out.println("The element is not found");
        }
        sc.close();
    }
}
