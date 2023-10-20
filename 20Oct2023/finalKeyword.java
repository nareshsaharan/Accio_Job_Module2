// final

class A {
    //final int x = 10;
    
    static final int x;
    static {
        x = 10;
    }
    
    A() {
       
    }
    
    final void fun() {
        System.out.println("abc");
    }
    
}

class B extends A {
    
    // void fun() {
    //     System.out.println("abc");
    // }
}

public class MyClass {
    public static void main(String args[]) {
        
           A o1 = new A();
        //   o1.x = 20;
           System.out.println(o1.x);
          
    }
}
