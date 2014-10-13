package practice;

public class Algorithm {

}
/*
	public static void main(String[] args) {
		
		int linkedListLength = Integer.parseInt(args[0]);
		int kPositionFromEnd = Integer.parseInt(args[1]);
		Node headNode = null;
		
		//Using Recursion - Start
		if(linkedListLength<=0){
			headNode=null;
		}
		else{
			headNode = new RecursiveLinkedListCreate().getHeadNode(linkedListLength);
		}
		
		Node presentNode = headNode;
		while(presentNode!=null){
			System.out.println("First Node value: "+presentNode.getData());
			presentNode = presentNode.getNextNode();
		}
		//Using Recursion - End
		
	//Not using Recursion - Start
		//headNode = new LinkedListCreate().getHeadNode(linkedListLength);
	//Not using Recursion - End
		
		if(headNode==null){
			System.out.println("Length of linked list need to be a positive value");
		}
		else{			
			Node currNode = headNode;
			int nodeCount = 0;
			while(currNode!=null){
				
				nodeCount++;
				currNode = currNode.getNextNode();
			}
			
			int kPositionFromStart = nodeCount-kPositionFromEnd+1;
			if(kPositionFromEnd<1){
				System.out.println("Please enter a positive position value");
			}
			else if(kPositionFromStart<1){
				System.out.println("The given linked List has only "+nodeCount+" nodes");
				System.out.println("Hence, "+kPositionFromEnd+" nodes from the last node is not possible");
			}
			else{
				currNode = headNode;
				for(int i=1;i<kPositionFromStart;i++){
					currNode = currNode.getNextNode();
				}
				
				while(currNode!=null){
					
					System.out.println((kPositionFromStart++)+"th Node value from the start of linked list is "+currNode.getData());
					currNode = currNode.getNextNode();
				}
			}
		}

	}

}
*/