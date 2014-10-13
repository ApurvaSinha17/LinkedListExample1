package practice;

public class LinkedListCreate {

	int count=1;
	Node node = new Node();
	Node prevNode;
	Node currNode;
	
	public Node getHeadNode(int linkedListLength){
		
		if(linkedListLength<=0){
			return null;
		}
		
		node.setData(count);
		node.setNextNode(null);
		prevNode = node;
		
		for(int i=2;i<=linkedListLength;i++){
			
			count++;
			currNode = new Node();
			currNode.setData(count);
			currNode.setNextNode(null);
			prevNode.setNextNode(currNode);
			prevNode = currNode;
		}		
		
		return node;
	}
}
