package searches;

import node.Node;

public abstract class AbstractSearch {

	private Node node;
	private int objective;

	private String path = "";

	private boolean finded = false;

	private boolean firstTime = true;

	//PRIVATED

	//PROTECTED

	protected Node getNode() { return this.node; }

	protected void setNode(Node node) { this.node = node; }

	protected int getObjective() { return this.objective; }

	protected void setObjective(int objective) { this.objective = objective; }

	protected String getPath() { return this.path; }

	protected void setPath(String path) { this.path = path; }

	protected boolean isFinded() { return this.finded; }

	protected void setFinded(boolean finded) { this.finded = finded; }

	protected boolean isResult(Node node) {
		return node.getValue() == this.objective;
	}

	protected void createPathByParent(Node node) {
		if (node == null) {
			return;
		}

		if (this.firstTime) {
			this.path = node.toString() + this.path;
			this.firstTime = false;
		}
		else {
			this.path = node.toString() + " -> " + this.path;
		}
		this.createPathByParent(node.getParentNode());
	}

	protected void printPath() {
		if (this.finded) {
			System.out.println("O caminho percorrido é: " + this.path);
		}
		else {
			System.out.println("O valor " + this.objective + " não foi encontrado");
		}
	}

	//PUBLIC

	public abstract void search();

}
