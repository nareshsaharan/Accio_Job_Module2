class A {
    
    void fun1(){
        System.out.println("A");
    }
}

class B extends A {
    
    void fun2(){
        System.out.println("B");
    }
}

public class MyClass {
    public static void main(String args[]) {
        B obj = new B();
        obj.fun1();
    }
}
