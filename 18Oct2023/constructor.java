class Dog {
    
    private String name;
    private double price;
    
    
    // Default constructor
    Dog() {
        System.out.println("Default Const");
        this.name = "Bruno";
        this.price = 500;
    }
    
    // parametrised const
    Dog(String name) {
        this.name = name;
    }
    
    Dog(String name, double price) {
        this.name = name;
        this.price = price;
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
        
        Dog d1 = new Dog();
        //d.setName("Tommy");
        System.out.println(d1.getName() +" "+d1.getPrice());
        
        Dog d2 = new Dog("Kito");
        System.out.println(d2.getName() +" "+d2.getPrice());
        
        Dog d3 = new Dog("Rocky", 1000);
        System.out.println(d3.getName() +" "+d3.getPrice());
        
        
      
    }
}
