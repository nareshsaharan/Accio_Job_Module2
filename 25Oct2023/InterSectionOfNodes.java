static Node intersectingNode(Node headA, Node headB)
{
	//write code here

	while(headA != null) {

		Node temp = headB;

		while(temp != null) {

			if(headA == temp) {
				return headA;
			}else {
				temp = temp.next;
			}
		}

		headA = headA.next;
		
		
	}

	return null;
	
}
