package datastr;

public class MyEdgeNode {
	//1. mainīgie
	private int indexOfVerticeTo;
	private int weight;// TODO ja vēlas, var arī float
	private MyEdgeNode nextEdgeNode = null;
	
	//2. getters
	public int getIndexOfVerticeTo() {
		return indexOfVerticeTo;
	}
	public int getWeight() {
		return weight;
	}
	public MyEdgeNode getNextEdgeNode() {
		return nextEdgeNode;
	}
	//3.setters
	public void setIndexOfVerticeTo(int indexOfVerticeTo) {
		if(indexOfVerticeTo >= 0)
		{
			this.indexOfVerticeTo = indexOfVerticeTo;
		}
		else
		{
			this.indexOfVerticeTo = 0;
		}
	}
	public void setWeight(int weight) {
		if(weight > 0)
		{
			this.weight = weight;
		}
		else
		{
			this.weight = 1;
		}
	}
	public void setNextEdgeNode(MyEdgeNode nextEdgeNode) {
		this.nextEdgeNode = nextEdgeNode;
	}
	
	//4.konstruktori/s
	public MyEdgeNode(int indexOfVerticeTo, int weight) {
		setIndexOfVerticeTo(indexOfVerticeTo);
		setWeight(weight);
	}
	//5.toString
	public String toString() {
		return "index: " + indexOfVerticeTo + " [" + weight + " km]";
	}

}
