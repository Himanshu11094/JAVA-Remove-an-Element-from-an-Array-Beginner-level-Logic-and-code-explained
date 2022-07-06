 
import java.util.Scanner;


public class DelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String animals[] = {"dog", "cat", "bat", "fish", "cow", "bull", "bear"}; 
				
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Older Version of Array: ");
	     printArray(animals);	 
		 
		 System.out.println("\nWhich animal you want to remove: ");
		 
		animals =  deleteElement(animals,input.nextLine());
		
		System.out.println("\nNew Version of Array: ");
	     printArray(animals);	
		
		
	}

	static void printArray(String[] passedArray)
	
	{
		
		for (int i=0; i < passedArray.length; i++)
		
		{
			System.out.print(passedArray[i]+",");
			
		}
		
		System.out.println("");
	}
	
	
	static String[] deleteElement(String newAnimals[],String animalToRemove)
	{
		
		int counter=0;
		
		String animals[] = new String[newAnimals.length-1];
		
		for (int i=0; i < newAnimals.length;i++)
		{
			
			if(newAnimals[i].equalsIgnoreCase(animalToRemove))
			{
				continue;
			}
			else 
				
			{animals[counter]=newAnimals[i];
			counter++;}
							
		}
		return animals;
		
	}
	 
	}
 