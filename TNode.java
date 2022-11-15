public class TNode{
	public char element;
	public TNode left;
	public TNode right;

	public TNode(char e, TNode l, TNode r){
		element = e;
		left = l;
		right = r;

	}

	public int e(){
		return element;
	}

	public TNode left(){
		return left;
	}

	public TNode right(){
		return right;
	}

	public void attach(TNode l, TNode r){
		left=l;   //assigning to right of root
		right=r;   //assigning to left of root
	}

}