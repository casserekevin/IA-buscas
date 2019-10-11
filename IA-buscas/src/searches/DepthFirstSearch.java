package searches;

import java.util.Stack;

import node.Node;

public class DepthFirstSearch extends AbstractSearch {

	private Stack<Node> stack;

	public DepthFirstSearch(Node node, int objective) {
		this.stack = new Stack<>();

		this.setNode(node);
		this.setObjective(objective);
	}

	//PRIVATE

	private boolean search(Node node) {
		if (this.isResult(node)) {
			//se for o objetivo
			this.createPathByParent(node);
			return true;
		}
		else {
			if ((node.getRightNode() != null)) {
				this.stack.push(node.getRightNode());
			}
			if ((node.getLeftNode() != null)) {
				this.stack.push(node.getLeftNode());
			}

		}

		Node firstNode = this.stack.pop();
		if ((firstNode != null) && this.search(firstNode)) {
			return true;
		}
		return false;
	}

	//PUBLIC

	@Override
	public void search() {
		this.setFinded(this.search(this.getNode()));
		this.printPath();
	}
}
