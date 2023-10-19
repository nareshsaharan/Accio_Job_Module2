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

class C extends B {
    
    void fun3(){
        System.out.println("C");
    }
}

public class MyClass {
    public static void main(String args[]) {
        C obj = new C();
        obj.fun1();
    }
}
