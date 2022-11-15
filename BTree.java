public class BTree{

	//Instance fields
	private TNode root;

	// Constructor
	public BTree(TNode r){
		root = r;
	}

	//Method that returns root of tree
	public TNode getRoot(){
		return root;
	}	

	//add root
	public void addRoot(TNode e){
		 root=e;
	}

	//postOrder(BSTNode v)
	// Prints out the keys of the tree in a postorder traversal
	public void postOrder(TNode v){
		if(v.left()!=null){
			postOrder(v.left());
		}
		if(v.right()!=null){
			postOrder(v.right());
		}
		System.out.println(v.e());
	
	}

	public void inOrder(TNode v){
		if(v.left()!=null){
			inOrder(v.left());
			System.out.print(v.k());
		if(v.right()!=null){
			inOrder(v.right());
		}
		}
	}


}