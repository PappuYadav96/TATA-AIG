package Abstraction_And_Encapsulation_Concept;


abstract class Vehicle {  // Abstraction Concept

	abstract void start();  // 1) i declare abstract method
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car start with key");
	}
}
class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("Scoter start with kick");
	}
	public static void main(String[] args)
	{
		// Vehicle v= new Vehicle();----> We Can't create object of abstract class

		Car c= new Car();  // I created object of Car class ----> child
		c.start();

		Scooter s= new Scooter();
		s.start();
	}
}

