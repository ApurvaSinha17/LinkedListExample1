package practice;

public class RecursionAlgorithm {

	public Node getKthNode(Node currNode,int kPos, NodeIndex i){
		
		if(currNode==null)
			return null;
		
		Node node = getKthNode(currNode.getNextNode(), kPos, i);
		i.index = i.index + 1;
		if(i.index==kPos)
			return currNode;
		
		return node;
	}
}

class NodeIndex{
	
	int index = 0;
}