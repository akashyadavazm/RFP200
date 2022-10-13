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

	static class Queue {
		static Node head = null;
		static Node tail = null;

		public static boolean isEmpty() {
			return head == null & tail == null;
		}
		public static void add(int data) {
			Node newNode = new Node(data);
			if(tail == null) {
				tail = head = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(56);
		q.add(30);
		q.add(70);
		
		System.out.println(q);

	}
}
