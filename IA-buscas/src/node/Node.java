package node;

public class Node {

	private int value;
	private int cost;

	private Node parentNode;
	private Node leftNode;
	private Node rightNode;

	public Node(int value) {
		this.value = value;
		this.cost = 0;
	}

	public Node(int value, int cost) {
		this.value = value;
		this.cost = cost;
	}

	public int getValue() { return this.value; }

	public void setValue(int value) { this.value = value; }

	public int getCost() { return this.cost; }

	public void setCost(int cost) { this.cost = cost; }

	public Node getParentNode() { return this.parentNode; }

	public void setParentNode(Node parentNode) { this.parentNode = parentNode; }

	public Node getLeftNode() { return this.leftNode; }

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
		this.leftNode.setParentNode(this);
	}

	public Node getRightNode() { return this.rightNode; }

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
		this.rightNode.setParentNode(this);
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
}
