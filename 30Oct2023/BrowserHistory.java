class Node {

    String data;
    Node next;
    Node prev;

    Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}



class BrowserHistory {


    Node head = null;
    Node curr = null;
    
    public BrowserHistory(String homepage) {

        head = new Node(homepage);
        curr = head;
            
    }
    
    public void visit(String url) {

        curr.next = new Node(url);
        curr.next.prev = curr;
        curr = curr.next;
        
        
    }
    
    public void back(int steps) {

        while(steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }

        System.out.println(curr.data);
        
    }

    public void forward(int steps) {

        while(steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }

        System.out.println(curr.data);
        
    }
}
