package Inheritance;

class Animal {  

	void eat()
	{
		System.out.println("I am eating");
	}
}
class Dog extends Animal  // extends keyword I used
{

	public static void main(String[] args) 
	{
		Dog d= new Dog();  // I created object of Dog Class--> Child class
		d.eat();
	}

}
