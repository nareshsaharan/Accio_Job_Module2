class Parent {
    
    void fun() {
        System.out.println("Parent");
    }
    
}

class Child extends Parent{

    void fun() {
        System.out.println("Child");
    }
}

public class MyClass {
    public static void main(String args[]) {
           Parent p = new Child();
           p.fun();
           
        // Child c = new Child();
        // c.fun();
        // Child c = new Parent();
        
    }
}
