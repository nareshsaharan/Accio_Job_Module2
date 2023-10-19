public class MyClass {
    
    static void fun1() {
        System.out.println("Fun1");
    }
    
    void fun2() {
        System.out.println("Fun2");
    }
    
    int var1 = 10;
    
    public static void main(String args[]) {
      // fun1();
      MyClass o1 = new MyClass();
      
      o1.fun2();
      System.out.println(o1.var1);
      
      //fun2();
      
      //System.out.println(var1);
    }
}
