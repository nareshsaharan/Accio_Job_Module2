class A {
    
    // static variables
    static int x;
    
    //static class
    static class InnerClass {
        
    }
    
    //block
    static {
        x = 10;
    }
    
    
    int y = 1;
    
    A() {
        x++;
        y++;
    }
    
    // static functions
    static void printData() {
        System.out.println("Static fun");
    }
}


public class MyClass {
    
    static {
        System.out.println("Static block");
    }
    
    
    
    
    public static void main(String args[]) {
      
    //   A o1 = new A();
    //   A o2 = new A();
      
    //   System.out.println(o1.x+" "+o1.y);
      
    }
}
