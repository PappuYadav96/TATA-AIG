package Polymorphism;

class Test1 
{ 
	// Method overriding---> Same method name, same Arguments, different Class, Inheritance concept(extends keyword)

	public void show()
	{
		System.out.println("1");

	}
}

class Xyz extends Test1  // Inheritance concept used--> extends keyword
{
 public	void show()
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{

		Test1 t= new Test1();   // Test1 class object create
		t.show();
	}

}
