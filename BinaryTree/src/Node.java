
public class Node {

	private Node left;
	private Node right;
	private int key;
	
	public Node (int key){
		this.key = key;
		left = null;
		right = null;
		
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	
	public Node getLeft(){
		return left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setKey(int k){
		this.key = k;
	}
	public int getKey(){
		return key;
	}
	public void print(){
		System.out.println("Key is: " + getKey());
	}
	
	
}
