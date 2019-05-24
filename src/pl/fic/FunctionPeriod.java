package pl.fic;

public class FunctionPeriod {
	public static void main(String[] args) {
		f(10);
	}
	
	static void f(int x) {
	    if (x==0) return;
	    System.out.printf(".");
	    f(x-1);
	    f(x-1);
	}
}
