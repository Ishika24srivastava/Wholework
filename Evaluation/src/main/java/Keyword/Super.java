package Keyword;

 class Animal {
	
		  public void animalSound() {
		    System.out.println("The animal makes a sound");
		  }
		}

		class Dog extends Animal { 
		  public void animalSound() {
		    super.animalSound(); // Call the superclass method
		    System.out.println("The dog says: bow wow");
		  }
		}

		public class Super {
		  public static void main(String args[]) {
		    Animal myDog = new Dog(); // Create a Dog object
		    myDog.animalSound(); // Call the method on the Dog object
		  }
		}

