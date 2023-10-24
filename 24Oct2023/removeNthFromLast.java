static int len(Node head) {

		int cnt = 0;
		while(head != null) {
			cnt++;
			head = head.next;
		}

		return cnt;
	}
    public static Node removeNthFromEnd(Node head, int n) {
		
		int size = len(head);
		int remFromStart = size - n + 1;

		Node headNew = head;
		
		// base case
		if(remFromStart == 1) {
			return head.next;
		}

		for(int i = 0; i < (remFromStart - 2); i++) {
			head = head.next;
		}

		head.next = head.next.next;

		return headNew;

		
		
		

		
}
