package Lambda;

interface Interface2 {
    void absfuna(int x);
    
    default void fun() {
        System.out.println("This is fun1");
    }
}

public class Myclass2 {

    public static void main(String[] args) {
        Interface2 fobj = (int x) -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(x * x * x);
                x++;
            }
        };
        
        // Now call the absfuna method with a value
        fobj.absfuna(2);
        
        // Call the default method
        fobj.fun();
    }
}
