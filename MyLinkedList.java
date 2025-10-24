public class MyLinkedList{
	private Node head;
	private Node tail;
	private int size;
	private static class Node{
		private Node next;
		private Node prev;
		private Object data;
		Node(Object o){
			this.next = null;
			this.prev = null;
			this.data = o;
		}
	}
	public MyLinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	// private void linkBefore(Node n, Object o){
	// 	Node newNode = new Node(o);
	// 	newNode.next = n.next;
	// 	newNode.prev = n.prev;
	// 	if(n.prev!= null){
	// 		n.prev.next = newNode;
	// 	}else{
	// 		head = newNode;
	// 	}
	// 	size++;
	// }
	// private void linkFirst(Object o){
	// 	Node newNode = new Node(o);
	// 	if(head == null){
	// 		tail = head = newNode;
	// 	}
	// 	else{
	// 		head.prev = newNode;
	// 		newNode.next = head;
	// 		head = newNode;
	// 	}
	// 	size++;
	// }
	private void linkLast(Object o){
		Node newNode = new Node(o);
		if(tail == null){
			head = tail = newNode;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	public boolean add(Object o){
		linkLast(o);
		return true;
	}
	// public int add(int pos,Object o){
	// 	linkBefore(pos,o);
	// 	return pos;
	// }
	@Override
	public String toString(){
		StringBuilder n = new StringBuilder("[");
		Node c =head;
		while(c!=null){
			n.append(c.data);
			if(c.next!=null) n.append(",");
			c = c.next;
		}
		n.append("]");
		return n.toString();
	}
}
