package datastr;

public class MyVerticeNode<Ttype> {
	//1. mainīgie
	private Ttype element;
	private MyEdgeNode firstEdgeNode = null;
	private boolean isVisited = false;//vakjdzīgs tikai apstaigāšanas algoritmam
	//2. getters
	public Ttype getElement() {
		return element;
	}
	public MyEdgeNode getFirstEdgeNode() {
		return firstEdgeNode;
	}
	//3.setters
	public void setElement(Ttype element) {
		if(element != null)
		{
			this.element = element;
		}
		else
		{
			this.element = (Ttype) new Object();
		}
	}

	public void setFirstEdgeNode(MyEdgeNode firstEdgeNode) {
		this.firstEdgeNode = firstEdgeNode;
	}
	
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	//4.konstruktori/s
	public MyVerticeNode(Ttype element) {
		setElement(element);
	}
	//5.toString
	public String toString() {
		String result = element + ": ";
		
		MyEdgeNode currentEdgeNode = firstEdgeNode;
		
		while(currentEdgeNode != null) {
			result += "-> [" + currentEdgeNode.getIndexOfVerticeTo() + "] "
					+ currentEdgeNode.getWeight() + " ";
			currentEdgeNode = currentEdgeNode.getNextEdgeNode();
		}
		
		return result;
		
	}
	

}
