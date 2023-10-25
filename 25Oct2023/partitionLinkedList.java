public void partition(Node head, int x) {
		
        Node left = null;
		Node right = null;

		Node headLeft = left;
		Node headRight = right;

		while(head != null) {

			if(head.data < x) {
				if(left == null) {
					left = new Node(head.data);
					headLeft = left;
				}
				else 
				{
					left.next = new Node(head.data);
					left = left.next;
				}
			}
			else {

				if(right == null) {
					right = new Node(head.data);
					headRight = right;
				}
				else 
				{
					right.next = new Node(head.data);
					right = right.next;
				}
				
			}

			head = head.next;
		}

		left.next = headRight;


		while(headLeft != null) {
			System.out.print(headLeft.data+" ");
			headLeft = headLeft.next;
		}
		
		
    }
