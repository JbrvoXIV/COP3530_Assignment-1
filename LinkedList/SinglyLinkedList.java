public class SinglyLinkedList {
	
    public Node head;
    
	public SinglyLinkedList(Node head) {
		this.head = head;
	}

	public void add(Node node) {
		if(head == null) {
			this.head = node;
			return;
		}
		Node curNode = head;
		while(curNode.next != null) {
			curNode = curNode.next;
		}
		curNode.next = node;
		node.next = null;
	}

	@Override
	public String toString() {
		if(head == null)//base case
			return "[]";
		String result = "[" + head;
		if(head.next != null)
			result += ", ";
		SinglyLinkedList rest = new SinglyLinkedList(head.next);
		
		return result + rest.toString().substring(1);
	}
}