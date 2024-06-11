import java.util.Scanner;

class SubStringTwo {
	static int search(String str, String sub) {
		boolean found = false;
		int index = -1;
		for (int i = 0; i < str.length(); i++) {
			int start = 0;
			boolean match = str.charAt(i) == sub.charAt(0);
			if (match) {
				start = i;
				found = true;
				for (int j = 1; j < sub.length(); j++) {
					boolean a = str.charAt(i + j) == sub.charAt(j);
					found = found && a;
				}
			}
			if (found) {
				index = start;
				break;
			}
		}
		return index;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.print("Enter the substring: ");
		String sub = sc.nextLine();
		sc.close();
		int found = SubStringTwo.search(str, sub);
		if (found >= 0) {
			System.out.println("Found at the index " + found);
		} else {
			System.out.println("Not found");
		}
	}
}