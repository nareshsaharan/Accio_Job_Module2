class Student {
    
    // public access modifier
    public int rollNum;
    
    // default access modifier
    String name;
    
    // private access modifier
    private int age;
    
    
    
    //getter and setter methods
    
    // getter method for rollNum
    public int getRollNum() {
        return this.rollNum;
    }
    
    // setter method for rollNum
    public void setRollNum(int rollNum) {
        
        if(rollNum < 0) {
            
            System.out.println("RollNum can not be negative");
            
            this.rollNum = -1 * rollNum;
            
            return;
        }
        
        this.rollNum = rollNum;
    }
    
    
    
}

public class MyClass {
    public static void main(String args[]) {
      
      Student s1 = new Student();
      
      
      s1.setRollNum(-10);
      
      System.out.println(s1.getRollNum());
      
      
      // s1.rollNum = -10;
      
      // s1.name = "Naresh Saharan";
      
      // s1.age = 23;
      
      
    }
}
