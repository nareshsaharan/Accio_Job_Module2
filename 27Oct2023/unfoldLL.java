static Node recItra(Node head) {

        Node curr = head;
        Node prev = null;

        while(curr != null) {

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
        
    }

    
    static void unfold(Node head)
    {
        Node l1 = null;
        Node l2 = null;
        Node t1 = null;
        Node t2 = null;

        int ind = 0;
        Node temp = head;

        while(temp != null) {

            if(ind % 2 == 0) {
                if(l1 == null) {
                    l1 = new Node(temp.data);
                    t1 = l1;
                }
                else 
                {
                    t1.next = new Node(temp.data);
                    t1 = t1.next;
                }
            }
            else 
            {
                if(l2 == null) {
                    l2 = new Node(temp.data);
                    t2 = l2;
                }
                else 
                {
                    t2.next = new Node(temp.data);
                    t2 = t2.next;
                }
                
            }

            ind++;
            temp = temp.next;
        }

        Node newL2 = recItra(l2);

        t1.next = newL2;

        while(l1 != null) {
            System.out.print(l1.data+" ");
            l1 = l1.next;
        }
            
            
    }

}
