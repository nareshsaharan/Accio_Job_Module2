public class MyClass {
    
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    
    static float add(int a, float b) {
        float c = a + b;
        return c;
    }
    
    static int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }
    
    
    public static void main(String args[]) {
      
      System.out.println(add(1, 2.5f));
      
    }
}
