package MethodOverloading;

public class TestMethod2 {
	static void add(int a,double d) {
		System.out.println("type is int and double");
	}
	static void add(double d,int a) {
		System.out.println("type is double and a");
	}
	static void add(double a,double b) {
		System.out.println("type is double and double");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20.5);
		add(10.0f,10);

	}

}
