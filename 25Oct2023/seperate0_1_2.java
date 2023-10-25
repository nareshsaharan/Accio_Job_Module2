static void unfold(Node head)
    {
		// O(N)
	    Node temp = head;
		String c0 = "";
		String c1 = "";
		String c2 = "";

		while(temp != null) {
			
			if(temp.data == 0) {
				c0 +="0 ";
			}else if(temp.data == 1) {
				c1 +="1 ";
			}else {
				c2 += "2 ";
			}
				
			temp = temp.next;
		}

		System.out.println(c0+c1+c2);

		// for(int i = 0; i < c0; i++) {
		// 	System.out.print(0+" ");
		// }

		// for(int i = 0; i < c1; i++) {
		// 	System.out.print(1+" ");
		// }

		// for(int i = 0; i < c2; i++) {
		// 	System.out.print(2+" ");
		// }
		
		//temp = head;

		// while(c0 > 0) {
		// 	temp.data = 0;
		// 	temp = temp.next;
		// 	c0--;
		// }

		// while(c1 > 0) {
		// 	temp.data = 1;
		// 	temp = temp.next;
		// 	c1--;
		// }

		// while(c2 > 0) {
		// 	temp.data = 2;
		// 	temp = temp.next;
		// 	c2--;
		// }

		// while(head != null) {
		// 	System.out.print(head.data +" ");
		// 	head = head.next;
		// }

		
		
		
    }
