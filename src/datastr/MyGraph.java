package datastr;

public class MyGraph<Ttype>{
	private MyVerticeNode<Ttype>[] vertices;
	private final int DEFAULT_SIZE = 5;
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;
	
	public int getHowManyElements()
	{
		return howManyElements;
	}
	
	public MyGraph() {
		vertices = new MyVerticeNode[size];
	}
	
	public MyGraph(int inputSize) {
		if(inputSize > 0 && inputSize < 1000) {
			size = inputSize;
		}
		
		vertices = new MyVerticeNode[size];
	}
	
	//isEmpty
	//isFull
	//resize

}
