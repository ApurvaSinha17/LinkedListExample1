package practice;

public class RecursionAlgorithm {
	
	private static Boolean printFlag = false;

	public static void main(String args[]){
		
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
		//Using Recursion - End
				printNode(headNode, kPositionFromEnd);
	}
	
	public static int printNode(Node headNode,int count){
		
	if(headNode==null){
		return 0;
	}
	int i = printNode(headNode.getNextNode(),count) + 1;
	if(i==count){
		printFlag=true;
	}
	if(printFlag){
		System.out.println(headNode.getData());
	}	
		return i;
	}
}
