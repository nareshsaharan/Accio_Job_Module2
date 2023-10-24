public static void remove(LinkedList ll, int toRemove){
		Node head = ll.head;
		
		if(toRemove == 0) {
			ll.head = head.next;
			return;
		}
		
		for(int i = 0; i < toRemove - 1; i++) {
			head = head.next;
		}

		head.next  = head.next.next;
        
    }
