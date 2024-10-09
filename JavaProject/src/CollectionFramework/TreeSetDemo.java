package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> tree1=new TreeSet<Integer>();
		
		tree1.add(10);
		tree1.add(20);
		tree1.add(100);

		tree1.add(120);
		tree1.add(220);
		tree1.add(1400);
		
		System.out.println("size is "+tree1.size());
		tree1.add(1);
		
		Iterator itr=tree1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("using sop");
		System.out.println(tree1);
		
		tree1.remove(20);
		System.out.println("First "+tree1.first());
		System.out.println(" last "+tree1.last());
		
		tree1.clear();
		
		System.out.println(tree1.isEmpty());
		
		System.out.println("===========================================");
		
		System.out.println("using enhanced for loop");
		
		for(int i : tree1) {
			
			System.out.println(i);
		}
		
		
	}

}
