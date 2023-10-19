class Z {
    
}

class A extends Z{
    int var1 = 50;
    A(int y) {
        
        System.out.println("A");
    }
    
    void fun() {
        System.out.println("Fun");
    }

}

class B extends A {
    
    B(){
        super(10);
        System.out.println("B" +" "+ super.var1);
        super.fun();
    }
    
}

class C extends B {
    
    C(){
        
        System.out.println("C");
    }
}

public class MyClass {
    public static void main(String args[]) {
        B obj = new B();
        
    }
}
