public static void reverse(Node head){

		if(head == null) {
			return ;
		}

		reverse(head.next);

		System.out.print(head.data+" ");

		
    }
