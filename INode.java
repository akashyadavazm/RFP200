package day15problems;

public interface INode<K> {

	void setNext(INode<K> tempNode);

	INode<K> getNext();

	Object getKey();

}
