
public class binaryTree {

	Node root;
	
	public binaryTree(){
		root = null;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public  Node insert(Node node, int key){
		if (node == null)
			node = new Node(key);
		else {
			if (key <= node.getKey())
				node.left = insert(node.left, key);
			else
				node.right = insert(node.right, key);
		}
		root = node;
		return node;		
	}
	

	
	public void delete (int key){
		if(isEmpty()){
			System.out.println("Tree Empty");
		}
		
		else if (search(root, key) == false){
			System.out.println("Sorry " + key + " is not present");
		}
		
		else {
			root = delete(root, key);
			System.out.println(key + " deleted from the tree");
		}
		
	}
	
	public int count(Node r){
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += count(r.getLeft());
			l += count(r.getRight());
			return l;
		}
	}
	
	public boolean search(Node r, int value){
		boolean found = false;
		while((r != null) && !found){
			int rval = r.getKey();
			if (value < rval)
				r = r.getLeft();
			else if(value > rval)
				r = r.getRight();
			else{
				found = true;
				break;
			}
			//found = search(r, value);
		}
		return found;
	}
	//print list in order
	public void Inorder(Node n){
		if (n != null){
			Inorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			Inorder(n.getRight());
		}
		//Inorder(root);
	}
	//print list as it was entered
	public void Preorder(Node n) {
		if (n!= null){
			System.out.print(n.getKey() + " ");
			Preorder(n.getLeft());
			Preorder(n.getRight());
		}
		//Preorder(root);
	}
	//print list backwards
	public void Postorder (Node r){
		if (r != null){
			Postorder(r.getLeft());
			Postorder(r.getRight());
			System.out.print(r.getKey() + " ");
		}
	}
	
	
	
	/*public void insert(Node n1, Node parentIns, Node insNode) {
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
			insert(n1, parentIns, insNode);
		}
		else{
			parentIns = insNode;
			insNode = insNode.getRight();
			insert(n1, parentIns, insNode);
		}
	}
	*/
	public boolean isEmpty(){
		return root == null;
	}
	
	
	
	private Node delete(Node root, int key){
		Node p, p2, n;
		
		if(root.getKey() == key){
			Node left, right;
			left = root.getLeft();
			right = root.getRight();
			if(left == null && right == null)
				return null;
			else if (left == null){
				p = right;
				return p;
			}
			else if (right == null){
				p = left;
				return p;
			}
			else{
				p2 = right;
				p = right;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(left);
				return p2;
			}
		}
		if (key < root.getKey()){
			n = delete(root.getLeft(), key);
			root.setLeft(n);
		}
		else{
			n = delete(root.getRight(), key);
			root.setRight(n);
		}
		
		return root;
	}
	

}
