static Node getMid(Node head) {

        if(head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //System.out.println(slow.data);

        return slow;
        
    }

    static Node merge(Node h1, Node h2) {

        Node out = null;
        Node to = null;
        
        while(h1 != null && h2 != null) {

            if(h1.data < h2.data) {
                
                if(out == null) {
                    out = new Node(h1.data);
                    to = out;
                }
                else 
                {
                     to.next = new Node(h1.data);
                     to = to.next; 
                }

                h1 = h1.next;
            }
            else {

                if(out == null) {
                    out = new Node(h2.data);
                    to = out;
                }
                else 
                {
                     to.next = new Node(h2.data);
                     to = to.next; 
                }

                h2 = h2.next;
                
            }
            
        }

        if(h1 != null) {
            to.next = h1;
        }
        else
        {
            to.next = h2;    
        }

        return out;

        
        
    }
    
    public static Node mergesort(Node head){

        if(head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node nextOfMid = mid.next;
        mid.next = null;

        Node left = mergesort(head);
        Node right = mergesort(nextOfMid);

        Node sortedList = merge(left, right);

        return sortedList;
        

        

    }
}
