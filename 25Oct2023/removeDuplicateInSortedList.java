 public Node solve(Node head) {

		if(head == null || head.next == null) {
			return head;
		}
		
		Node recHead = solve(head.next);

		if(head.data == recHead.data) {
			return recHead;
		}else {
			head.next = recHead;
			return head;
		}

		

		
    }
