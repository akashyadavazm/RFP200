package day14Problems.LinkedList;

public class LinkedListUC3<Node> {

	Node data;
	LinkedListUC3<Integer> nextnode;

	public LinkedListUC3(Node data) {
		
		this.data = data;
		this.nextnode = null;

	}

	public static void main(String[] args) {

		LinkedListUC3<Integer> node1 = new LinkedListUC3<>(30);
		LinkedListUC3<Integer> node2 = new LinkedListUC3<>(70);
		LinkedListUC3<Integer> node3 = new LinkedListUC3<>(56);
		
		node1.nextnode = node2;
		node2.nextnode = node3;

		showlist(node1);

	}

	private static void showlist(LinkedListUC3<Integer> startingnode) {

		LinkedListUC3<Integer> temp = startingnode;
		while (temp != null) {
			System.out.print(temp.data +" -> ");
			temp = temp.nextnode;

		}

	}

}
