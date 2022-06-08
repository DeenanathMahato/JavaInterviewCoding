package code.interview.test;

public class LinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void printList() {
		Node presentNode = head;
		while (presentNode != null) {
			System.out.print(presentNode.data + " ");
			presentNode = presentNode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);

		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);

		llist.head.next = secondNode;
		secondNode.next = thirdNode;
		
		llist.printList();
	}

}
