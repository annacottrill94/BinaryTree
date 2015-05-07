import java.util.Scanner;


public class controller {

	public static void main(String[] args) {
		binaryTree tree = new binaryTree();
		
		Node n1 = new Node(3);
		Node n2 = new Node(23);
		Node n3 = new Node(43);
		Node n4 = new Node(63);
		
		tree.insertRec(n1, tree.getRoot(), tree.getRoot());
		tree.insertRec(n2, tree.getRoot(), tree.getRoot());
		tree.insertRec(n3, tree.getRoot(), tree.getRoot());
		tree.insertRec(n4, tree.getRoot(), tree.getRoot());
		
		Scanner input = new Scanner(System.in);
		
		/*tree.insert(3);
		tree.insert(9);
		tree.insert(7);
		tree.insert(11);
		tree.insert(1);
		 */
		tree.printInorder(tree.getRoot());
	}

}
//https://www.youtube.com/watch?v=tzh4BLhE7tw