
/*

This    Testing@16f65612
Object  Testing@16f65612

*/
class Testing {
    
    int a = 1;
    
    Testing() {
        //this(3);
        a = 2;
    }
    
    Testing(int a) {
        this();
        this.a = a;
    }
    
    /*
      
        Testing t = new Testing(3);
        System.out.println(t.a);
    */
    
    
    // Testing() {
    //     System.out.println("This"+" "+ this);
    // }
    
    
}

public class MyClass {
    public static void main(String args[]) {
        
        Testing t = new Testing(3);
        System.out.println(t.a);
        
        // System.out.println("T1\n");
        // Testing t1 = new Testing();
        // System.out.println("Object"+" "+ t1);
        
        
        // System.out.println("T2\n");
        // Testing t2 = new Testing();
        // System.out.println("Object"+" "+ t2);
        
        
    }
}
