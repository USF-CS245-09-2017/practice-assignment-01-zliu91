public class Factorial {

	public int factorial(int n, String type) {
		if(n<1) {
			System.out.println("input have to be bigger than 0");
		}
		if(type.compareTo("recursive")==0) {
			return factorial_recursive(n);
		}
		if(type.compareTo("iterative")==0) {
			return factorial_iterative(n);
		}
		return 0;
	}

	public int factorial_iterative(int n) {
		int r = 1;
		for(int i=1;i<=n;i++) {
			r = r * i;
		}
		return r;
	}

	public int factorial_recursive(int n) {
		if(n==1) {
			return 1;
		}
		return n * factorial_recursive(n-1);
	}
}