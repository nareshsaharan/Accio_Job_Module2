class Dog {
    
    private String name;
    private double price;
    
    
    Dog(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    Dog(Dog d) {
        this.name = d.name;
        this.price = d.price;
    }
    
    // getter
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}

public class MyClass {
    public static void main(String args[]) {
        
        
        Dog d1 = new Dog("Rocky", 1000);
        
        Dog d2 = new Dog(d1);
        d2.setName("Bruno");
        //System.out.println(d2.getName() +" "+d2.getPrice());
        System.out.println(d1.getName());
        
        // Dog d1 = new Dog("Rocky", 1000);
        // //System.out.println(d1.getName() +" "+d1.getPrice());
        
        // Dog d2 = d1;
        // //System.out.println(d2.getName() +" "+d2.getPrice());
        
        // d2.setName("Bruno");
        
        // System.out.println(d1.getName());
        
        
        
        
      
    }
}
