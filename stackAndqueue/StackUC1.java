package day14Problems.stackAndqueue;

public class StackUC1 {

	public class Node {

		int data;
		Node Next;

		public Node(int data) {

			this.data = data;
			this.Next = null;

		}

	}

	public Node head, tail = null;

	public void addData(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.Next = newNode;
			tail = newNode;
		}

	}
	public void display() {
		Node temp = head;
		if(temp == null) {
			System.out.println("Stack is Empty");
		}
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp = temp.Next;
		}
		
	}

	public static void main(String[] args) {
		StackUC1 s = new StackUC1();
		s.addData(56);
		s.addData(30);
		s.addData(70);
		
		s.display();

	}
}
