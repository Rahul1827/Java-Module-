package Lambda;
interface Interface4
{
void absfuna(int x , int y, int z);
default void fun()
{
System.out.println("This is fun1");	
}


default void fun1()
{
System.out.println("This is fun2");	
}


}
public class MyClass3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                           Interface4 fobj =(int x , int y, int z) ->
                           {System.out.println("Multiply"+(x*y*z));
                           
                           System.out.println("====================================");
                           
                           System.out.println("Additipn"+(x+y+z));
                           
                           System.out.println("====================================");
                           
                           System.out.println("Substraction"+(x-y-z));
                           
                           
                           System.out.println("Multiply"+(10*x));
                           };
                           fobj.absfuna(02, 03, 05);
                           fobj.absfuna(06, 04, 02);
                           fobj.absfuna(07, 04, 01);
                           fobj.absfuna(07, 01, 02);
                           
                           
                           System.out.println("======================================");
                           fobj.fun();
                           fobj.fun();
	}

}
