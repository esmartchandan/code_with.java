class Larger{
	public static void main(String args[]){
		double a, b;
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		if(a>b){
			System.out.println(a + " is greter then " + b);
		} else if(a < b){
			System.out.println(a + " is less then " + b);
		} else {
			System.out.println(a + " and " + b + " both are equal");
		}
	}
}