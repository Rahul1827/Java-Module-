package CollectionFramework;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Character, String> table1= new Hashtable<Character, String>();
		
		table1.put('R',"Royal");
		table1.put('A', "Ambitious");
		table1.put('H', "Honest");
		table1.put('U', "Unique");
		table1.put('L',"Loyal");
		table1.put('R',"Rahul");
		
		System.out.println(table1);
		
		System.out.println(table1.get('A'));
		System.out.println(table1.get('R'));
		System.out.println(table1.get('H'));
		
		//clear,contains, isEmpty,remove(),replace,toString,size()

	}

}
