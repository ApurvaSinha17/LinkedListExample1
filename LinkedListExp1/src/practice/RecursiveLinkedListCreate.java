package practice;

public class RecursiveLinkedListCreate {

	int count=1;
	
	public Node getHeadNode(int linkedListLength){
		
		if(linkedListLength==0){
			return null;
		}
		Node node = new Node();
		node.setData(count);
		count++;
		node.setNextNode(getHeadNode(linkedListLength-1));
		return node;
	}
}
