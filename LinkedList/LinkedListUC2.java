package day14Problems.LinkedList;

public class LinkedListUC2<Node> {

	Node data;
	LinkedListUC2<Integer> nextnode;

	public LinkedListUC2(Node data) {

		this.data = data;
		this.nextnode = null;

	}

	public static void main(String[] args) {

		LinkedListUC2<Integer> node1 = new LinkedListUC2<>(70);
		LinkedListUC2<Integer> node2 = new LinkedListUC2<>(30);
		LinkedListUC2<Integer> node3 = new LinkedListUC2<>(56);

		node1.nextnode = node2;
		node2.nextnode = node3;

		showlist(node1);

	}

	private static void showlist(LinkedListUC2<Integer> startingnode) {
		LinkedListUC2<Integer> temp = startingnode;
		while (temp != null) {

			System.out.print(temp.data + " -> ");
			temp = temp.nextnode;

		}

	}

}