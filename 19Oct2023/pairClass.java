class Pair {
    String name;
    int price;
    
    Pair(String name, int price) {
        this.name = name;
        this.price = price;
    }
}



public class MyClass {
    
    static Pair fun() {
        
        Pair p1 = new Pair("Choclates", 1000);
        
        return p1;
        
    }
    public static void main(String args[]) {
        Pair ans = fun();
        
        System.out.println(ans.name +" "+ans.price);
    }
}
