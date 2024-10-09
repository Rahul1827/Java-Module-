package Generics;


class Myclass{
	//Generic method to print array with different data type
	
	public<E> void printArray(E[]arr1)
	{
		for(E i :arr1)
		{
			System.out.println(i);
			
		}
		System.out.println("******************************");
	}
	
	
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myclass myclass = new Myclass();
//Pass the Integer Array

    int arr[]= {33,3,55,3};
    Integer[]arrInt= {11,22,33,44,55};
    myclass.printArray(arrInt);
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    

    float arr1[]= {33.04f,3.25f,55.00f,3.0f};
    Float[]arrFloat= {11.01f,22.54f,33.78f,44.87f,55.00f};
    myclass.printArray(arrFloat);
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    
    
    
   double arr3[]= {33.99,3.11,55.00,3.77};
    Double[]arrFloaDouble= {11.0112,22.5448,33.78784,44.87214,55.00897};
    myclass.printArray(arrFloaDouble);
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
	}
	
}

