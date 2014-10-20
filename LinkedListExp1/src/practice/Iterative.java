package practice;

public class Iterative {

	public Node getKthNode(Node headNode, int k){
		
		if(headNode==null)
			return null;
		
		int posFromStart = 0;
		Node node = headNode;
		
		while(node!=null){
			
			if(posFromStart==k)
				break;
			posFromStart++;
			node = node.getNextNode();
		}
		
		Node currNode = headNode;
		Node kNode = node;
		
		while(kNode!=null){
			
			currNode = currNode.getNextNode();
			kNode = kNode.getNextNode();
		}
		
		return currNode;
	}
}
