package CollectionFramework;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, String>  hashmap=new HashMap<Character, String>();
		
		hashmap.put('R',"Royal");
		hashmap.put('A', "Ambitious");
		hashmap.put('H', "Honest");
		hashmap.put('U', "Unique");
		hashmap.put('L',"Loyal");
		hashmap.put(null, "Unknown");
		hashmap.put(null, "Divya");
		hashmap.put('B', "Borathe");
		
		
		System.out.println(hashmap);
		
		
		boolean res= hashmap.containsKey('R');
		System.out.println(res);
		
		
		hashmap.remove('A');
		hashmap.replace('B', "Bina", "Bhushan");
		
		System.out.println(hashmap);
		
		
		System.out.println("********************************************");
		System.out.println("Displaying the key");
		//get all keys of hashmap
		
		Object[] keys=hashmap.keySet().toArray();
		System.out.println("\n keys");
		for(int i=0; i< keys.length;i++)
		{
			System.out.println(keys[i]+" ");
		System.out.println(hashmap.get(keys[i]));
		System.out.println("****************************");
		
		
		System.out.println("To get one value ");
		System.out.println(hashmap.get('R'));
		
		}
	}

}
