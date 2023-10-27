import java.util.*;

class Node {
    int data;
    Node next, random;

    Node(int d) {
        data = d;
        next = random = null; 
    }
}

class Main {
    
    public static Node addToTheLast(Node head, Node node) {
        if (head == null) {
            head = node;
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
            return head;
        }
    }

    public static boolean validation(Node head, Node res) {

        Node temp1 = head;
        Node temp2 = res;

        int len1 = 0, len2 = 0;
        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        

        if (len1 != len2) return false;
            
        HashMap<Node,Node> a = new HashMap<Node, Node>();
        
        temp1 = head;
        temp2 = res;
        while (temp1 != null) {
            
            if(temp1==temp2)
                return false;
            
            if (temp1.data != temp2.data) return false;
            
            
            
            if (temp1.random != null && temp2.random != null) {
                if (temp1.random.data != temp2.random.data) return false;
            } else if (temp1.random != null && temp2.random == null)
                return false;
              else if(temp1.random== null && temp2.random !=null)
                return false;
            if(!a.containsKey(temp1)){
                a.put(temp1,temp2);   
            }
            
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }
        
        if(a.size()!=len1)
            return false;
        
        temp1 = head;
        temp2 = res;
        while (temp1 != null) {
           
            if (temp1.random != null && temp2.random != null) {
                if (a.get(temp1.random) != temp2.random) return false;
            } 
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Node head= null,head2 = null;
            int n = sc.nextInt();
            int q = sc.nextInt();

            int a1 = sc.nextInt();
            head = addToTheLast(head,new Node(a1));
            head2 = addToTheLast(head2,new Node(a1));
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                head = addToTheLast(head, new Node(a));
                head2 = addToTheLast(head2,new Node(a));
            }

            for (int i = 0; i < q; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                Node tempA = head;
                Node temp2A = head2;
                int count = -1;

                while (tempA != null) {
                    count++;
                    if (count == a - 1) break;
                    tempA = tempA.next;
                    temp2A = temp2A.next;
                }
                Node tempB = head;
                Node temp2B = head2;
                count = -1;

                while (tempB != null) {
                    count++;
                    if (count == b - 1) break;
                    tempB = tempB.next;
                    temp2B = temp2B.next;
                }

                // when both a is greater than N
                if (a <= n){
                    tempA.random = tempB;
                    temp2A.random = temp2B;
                }
            }

            Solution g = new Solution();
            Node res = g.copyList(head);

            if (validation(head, res) == true && validation(head2, res))
                System.out.println("1");
            else
                System.out.println("0");
    }
}

class Solution {
    
    Node copyList(Node head) {


        Node l2 = null;
        Node t2 = null;
        Node l1 = head;

        while(l1 != null) {

            if(l2 == null) {
                l2 = new Node(l1.data);
                t2 = l2;
            }
            else 
            {
                t2.next = new Node(l1.data);
                t2 = t2.next;
            }
            l1 = l1.next;
        }

        ArrayList<Integer>  al = new ArrayList<>();

        l1 = head;

        while(l1 != null) {

            if(l1.random == null) {
                al.add(-1);
                l1 = l1.next;
                continue;
            }

            Node templ2 = head;
            int cnt = 0;

            while(templ2 != null) {

                if(templ2 == l1.random) {
                    al.add(cnt);
                    break;
                }
                cnt++;
                templ2 = templ2.next;
                
            }
            l1 = l1.next;
            
        }


        t2 = l2;

        for(int i = 0; i < al.size(); i++) {

            if(al.get(i) == -1) {
                t2.random = null;
                t2 = t2.next;
                continue;
            }

            Node temp = l2;
            int x = al.get(i);
            while(x-- > 0) {
                temp = temp.next;
            }
            
            t2.random = temp;
            t2 = t2.next;
            
        }
        
        return l2;
        
        
    }
    
}
