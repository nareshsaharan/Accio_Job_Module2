class IndexOutOfBound extends Exception{
    
    public IndexOutOfBound(String message) {
        
        super(message);
    }
}


class DynamicArray {
    int arr[];
    int si;
    
    DynamicArray() {
        arr = new int[2];
        si = 0;
    }
    
    void add(int val) {
        
        // check array is full or not
        if(si == arr.length) {
            reSize();
        }
        
        arr[si] = val;
        si++;
    }
    
    void reSize() {
        
        int newArr[] = new int[2 * arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        arr = newArr;
        
    }
    
    void isSafe(int ind) throws IndexOutOfBound {
        
        if(ind >= size() || ind < 0) {
            throw new IndexOutOfBound("Index "+ ind + " out of bounds for length "+ size());
        }
            
    }
    
    int get(int ind)  {
        
        try {
            isSafe(ind);
            
        }catch(IndexOutOfBound e) {
            
            System.out.println(e.getMessage());
            return -1;
        }
        
        
        return arr[ind];
        
    }
    
    int size() {
        return si;
    }
    
    void set(int ind, int val) {
        
        try {
            
            isSafe(ind);
            
        }catch(IndexOutOfBound e) {
            System.out.println(e.getMessage());
            return ;
        }
        
        arr[ind] = val;
        
    }
    
    void remove(int ind) {
        
        try {
            isSafe(ind);
            
        }catch(IndexOutOfBound e) {
            
            System.out.println(e.getMessage());
            
            return ;
        }
        
        for(int i = ind + 1; i < size(); i++) {
            arr[i-1] = arr[i];
        }
        
        si--;
        
    }
    
    public String toString() {
        
        String str = "";
        
        for(int i = 0; i < size(); i++) {
            str += arr[i] + " ";
        }
        
        return str;
    }
    
    
}

public class MyClass {
    public static void main(String args[]) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        
        System.out.println(da);

        System.out.println(da.size()); 
        
        if(da.get(10) != -1) {
            System.out.println(da.get(10));       
        }
        
        da.set(2, 20);
        System.out.println(da);
         
        da.remove(0);
        
        System.out.println(da);
    }
}
