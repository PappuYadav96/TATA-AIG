package Inheritance;

public class A {  // its example of Single level inheritance

	void showA()
	{
		System.out.println("a class method");
	}
}
class B extends A
{
	 void showB()
	{
		System.out.println("b class method");
	}
	public static void main(String[] args) 
	{

		A ob1= new A();   // object create of parent class----> through this we can call parent class only
		ob1.showA();

		B ob2= new B();  // object create of child class--> through this we can call both parent class and child class
		ob2.showA();
		ob2.showB();
	}}
