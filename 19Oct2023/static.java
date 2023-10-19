class A {
    static int a = 10;
    int b;
}

public class MyClass {
    public static void main(String args[]) {
        
        //System.out.println(A.b);
        
        A o1 = new A();
        o1.b = 1;
        o1.a = 5;
        
        A o2 = new A();
        o2.b = 2;
        o2.a = 15;
        
        A o3 = new A();
        o3.b = 3;
        o3.a = 25;
        
        System.out.println(o1.a +" "+o2.a+" "+o3.a);
    }
}
