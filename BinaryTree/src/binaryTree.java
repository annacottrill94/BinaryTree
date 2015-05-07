
public class binaryTree {

	Node root;
	
	public binaryTree(){
		root = null;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public void insert(int key){
		Node n1 = new Node(key);
		
		if (root == null){
			root = n1;
		}
		else{
			Node parIns = root; //parent
			Node insNode = root; //insert
			
				while (insNode != null){
					parIns = insNode;
					
					if(key < insNode.getKey()){
						insNode = insNode.getLeft();
					}
					else{
						insNode = insNode.getRight();
					}
				}//insertion is over
			
			if (key < parIns.getKey()){
				parIns.setLeft(n1);			
			}
			else {
				parIns.setRight(n1);
			}
			
		}
			
	}
	
	public void printInorder(Node n){
		if (n != null){
			printInorder(n.getLeft());
			n.print();
			printInorder(n.getRight());
		}
	}
	
	public void insertRec(Node n1, Node parentIns, Node insNode) {


		if (root == null){
			root = n1;
		}
		
		else if(insNode == null){

			if(n1.getKey() < parentIns.getKey()){
				parentIns.setLeft(n1);
			}

			else{
				parentIns.setRight(n1);
			}

			return;
		}

		else if (n1.getKey() < insNode.getKey()){
			parentIns = insNode;
			insNode = insNode.getLeft();
			insertRec(n1, parentIns, insNode);
		}

		else{
			parentIns = insNode;
			insNode = insNode.getRight();
			insertRec(n1, parentIns, insNode);
		}


	}
	

}
