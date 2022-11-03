package day14Problems.stackAndqueue;

public class QueueUC3 {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	static Node head = null;
	static Node tail = null;

	public static boolean isEmpty() {
		return head == null & tail == null;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (tail == null) {
			tail = head = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("Queue is Empty");
		}else {
			while(temp!=null) {
				System.out.print(temp.data+"-> ");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		QueueUC3 q = new QueueUC3();
		q.add(56);
		q.add(30);
		q.add(70);

		q.display();

	}
}
