package oops;
class Vehicle {
		    void car() {
		        System.out.println("The car is audi.");
		    }
		}
		class Engine extends Vehicle {
		    void engine() {
		        System.out.println("The car is an engine.");
		    }
		}
		public class single
		{
		  public static void main(String[] args)
		  {
		        Engine e = new Engine();
		        e.car(); 
		        e.engine();
		        
		    }
	}


