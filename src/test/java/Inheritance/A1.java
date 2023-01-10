package Inheritance;
class A1    // Its Example of Multilevel Inheritance
{
	void showA1()
	{
		System.out.println("a class method");

	}
}
class B1 extends A1
{
	void showB1()
	{
		System.out.println("b class method");

	}
}

class C extends B1
{
	void showC()
	{
		System.out.println("c class method");
	}
	public static void main(String[] args)
	{
		A1 ob1= new A1();
		ob1.showA1();

		B1 ob2= new B1();
		ob2.showA1();
		ob2.showB1();


		C ob3= new C(); // if i create object of C class then I will call the above method here
		ob3.showA1();
		ob3.showB1();
		ob3.showC();
	}}