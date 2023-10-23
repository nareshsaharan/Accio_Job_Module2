class MyCustomException extends Exception {
    
    public MyCustomException(String message) {
        super(message);
    }
}

public class MyClass {
    
    public static int divide(int num, int demo) throws  MyCustomException {
        
        if(demo == 0) {
            throw new MyCustomException("Deno is zero");
        }else {
            return num/demo;
        }
        
    }
    
    public static void main(String args[])  {
      
      
      try {
          
          int res = divide(10, 0);
          
      }
      catch(MyCustomException e) {
          System.out.println(e.getMessage());
      }
      
      
    }
}
