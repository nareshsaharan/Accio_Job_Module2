import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Start");
        
        try {
            int n = 5 / 0;
        }
        catch(Exception e) {
            System.out.println(e);
            
        }
        finally {
            s.close();
            System.out.println("Must Run");
        }
        
        System.out.println("End");
        
    }
}
