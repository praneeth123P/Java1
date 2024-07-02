package oops;

			class Animal {
		    void eat() {
		        System.out.println("This animal eats food.");
		    }
		}

		class Mammal extends Animal {
		    void breathe() {
		        System.out.println("This mammal breathes air.");
		    }
		}

		
		class Dog extends Mammal {
		    void bark() {
		        System.out.println("The dog barks.");
		    }
		}

		public class multilevel 
		{
		 public static void main(String[] args) {
		        Dog myDog = new Dog();
		        myDog.eat(); 
		        myDog.breathe(); 
		        myDog.bark(); 
		    }
		

	}


