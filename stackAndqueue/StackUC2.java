package day14Problems.stackAndqueue;

public class StackUC2 {

	public class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			next = null;

		}
	}

		public static Node head;
		public static boolean isEmpty() {
			return head == null;
			
		}
		public void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
				return;
				
			}
			newNode.next = head;
			head = newNode;
			
		}
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}

	public static void main(String[] args) {
		
		StackUC2 s = new StackUC2();

		s.push(70);
		s.push(30);
		s.push(56);
		while(!StackUC2.isEmpty()) {
			System.out.print(s.peek()+"-> ");
			s.pop();
		}

	}

}