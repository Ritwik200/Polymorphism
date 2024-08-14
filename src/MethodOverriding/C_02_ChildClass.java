package MethodOverriding;

public class C_02_ChildClass extends C_01_ParentClass {
	
	public void display() {
		System.out.println("This is child class display method");
	}
	public void show() {
		System.out.println("This is child class show method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_02_ChildClass ob = new C_02_ChildClass();
		ob.display();
		ob.show();
		ob.disp();
		
		C_01_ParentClass ob1 = new C_01_ParentClass();
		ob1.display();
		ob1.show();
		ob1.disp();
		
		C_01_ParentClass ob2 =  new C_02_ChildClass();
		ob2.display();
		ob2.show();
	}

}
