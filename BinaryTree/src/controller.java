import java.util.InputMismatchException;
import java.util.Scanner;


public class controller {

	public static void main(String[] args) {
		binaryTree tree = new binaryTree();
		Scanner input = new Scanner(System.in);
		char ch;
		int choice = 0;
		do{
			
			try {
				System.out.println("Operations");
				System.out.println("1. insert ");
	            System.out.println("2. delete");
	            System.out.println("3. search");
	            System.out.println("4. count nodes");
	            System.out.println("5. check empty");
	            
	            choice = input.nextInt();
			}
            catch(InputMismatchException exception) {
              //System.out.println("This is not a number - please try agian.");
            }
            
            switch(choice){
            case 1:
            		try{
            	
            		System.out.println("Enter number you would like to insert");
                	tree.insert(tree.root, input.nextInt());
	            	}
	            	catch(InputMismatchException exception){
	            		System.out.println("Please enter a number");
	            	}
            	break;
            case 2:
            	System.out.println("Ender number you would like to delete");
            	tree.delete(input.nextInt());
            	break;
            case 3:
            	System.out.println("Enter number you would like to search for");
            	System.out.println("Seach result : " + tree.search(tree.root, input.nextInt()));
            	break;
            case 4:
            	System.out.println("Nodes = " + tree.count(tree.root));
            	break;
            case 5:
            	System.out.println("Empty status = " + tree.isEmpty());
            	break;
            default:
            	System.out.println("Incorrect entry - please enter a number from the list");
            	break;
            }
            System.out.print("\nPost order : ");
            tree.Postorder(tree.root);
            System.out.print("\nPre order : ");
            tree.Preorder(tree.root);
            System.out.print("\nIn order : ");
            tree.Inorder(tree.root);
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            
            ch = input.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');
		
		
		input.close();
		}

		
	}


