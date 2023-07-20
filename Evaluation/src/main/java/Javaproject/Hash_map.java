package Javaproject;
import java.util.HashMap;
import java.util.Map;

public class Hash_map {
	

	
		public static void main(String[]args)
		{
			//Create a new HashMap
			Map<String,Integer> map=new HashMap<>();
			
			//Add key-value pair to HashMap
			map.put("Ishika", 22);
			map.put("Ram", 25);
			map.put("Shyam", 21);
			map.put("Vani", 27);
			
			//Get the value from HashMap
			int age1=map.get("Ishika");
			System.out.println("Age of ishika is"+age1);
			
			//Replace the value in HashMap
			map.replace("Ishika", 22, 21);			
			//To check if a key is present in HashMap
			
			boolean contains=map.containsKey("Shyam");
			System.out.println(" Shyam is in the map"+contains);
			
			//For removing   the pair
			map.remove("Ram");
			
			//For iterate the key value
			for(Map.Entry<String, Integer> entry:map.entrySet())
			{
				String name=entry.getKey();
				int age=entry.getValue();
				System.out.println("The name of the person is  "+name+ "  and age  is "+age);
				
			}
			
			//Get the size of map
			int size=map.size();
			System.out.println("The size of hash map= "+size);
			
			//clear the map
			map.clear();
			
			//check map is empty
			boolean empty=map.isEmpty();
			System.out.println("The HashMap is empty = "+empty);
			}
			
		}




