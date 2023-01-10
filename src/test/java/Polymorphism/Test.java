package Polymorphism;

public class Test {    // Method Overloading ------>Concept

	public void show(String b,int a)  // here i am passing two argument
	{
		System.out.println("1");
	}

	public void show(int a)    // here i am passing one argument int type
	{
		System.out.println("2");
	}

	public static void main(String[] args)	
	{
		Test t= new Test();
		t.show("Pappu",10);    // here i am passing both string and int type argument..so it will call that method
		t.show(50);     // here it will call one argument method
	}
}







