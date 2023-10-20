abstract class A {
    
    abstract void fun();
    abstract int fun2();
    
    void fun3() {
        System.out.println("Hey");
    }
}


class B extends A{
    
    void fun() {
        System.out.println("Hii");
    }
    
    int fun2() {
        return 1;
    }
    
 }
 
 
abstract class Bank {
    
    int interest;
    
    abstract double calculateROI();
    
}

class SBI extends Bank {
    
    double calculateROI() {
        return 4 * super.interest;
    }
}

class PNB extends Bank {
    
    double calculateROI() {
        return 5 * super.interest;
    }
}

class Axis extends Bank {
    
    double calculateROI() {
        return 6 * super.interest;
    }
}


public class MyClass {
    public static void main(String args[]) {
        //A obj = new A();
    }
}
