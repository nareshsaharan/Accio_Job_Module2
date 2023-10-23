import java.io.IOException;

public class MyClass {
    
    
    static void calculateData() {
        
        try 
        {
            int num = 1000;
        
            int i = 5;
            int arr[] = new int[5];
            arr[10] = 10;
            
            while(i > -1) {
                num = num/i;
                i--;
            }
            
            System.out.println("Final Value of Num :"+num);
        }
        catch(ArithmeticException e) {
            System.out.println("There is an ArithmeticException in function calculateData "+ e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("There is an IndexOutOfBoundsException in function calculateData "+ e);
        }
        catch(Exception e) {
            
        }
        
        
        
        
    }
    
    public static void main(String args[]) {
      
      System.out.println("hello");
      calculateData();
      
      System.out.println("Other Stuff");
    //   //int n = 10/ 0;
    //   try {
          
    //       int n = 10 / 0;
          
    //   }catch(Exception e) {
          
    //       System.out.println(e);
    //   }
      
      
      
      
      
    }
}
