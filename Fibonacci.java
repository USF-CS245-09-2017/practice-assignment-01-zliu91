public class Fibonacci {

	public int fibonacci(int n, String type) {
		if(n<1) {
			System.out.println("input have to be bigger than 0");
		}
		if(type.compareTo("recursive")==0) {
			return fibonacci_recursive(n);
		}
		if(type.compareTo("iterative")==0) {
			return fibonacci_iterative(n);
		}
		return 0;
	}

	public int fibonacci_iterative(int n) {
		int a = 0;
		int b = 1;
		int r;
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}
		for(int i = 0;i < n-2;i++) {
			if(a==b) {
				a = a + b;
			}else if(a<b) {
				a = a + b;
			}else if(b < a) {
				b = b + a;
			}
		}
		r = a + b;
		return r;
	}

	public int fibonacci_recursive(int n) {
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
	}


}