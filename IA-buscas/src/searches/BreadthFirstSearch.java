package searches;

import java.util.LinkedList;
import java.util.Queue;

import node.Node;

public class BreadthFirstSearch extends AbstractSearch {

	private Queue<Node> fila;

	public BreadthFirstSearch(Node node, int objective) {
		this.fila = new LinkedList<>();

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
			if (node.getLeftNode() != null) {
				this.fila.add(node.getLeftNode());
			}
			if (node.getRightNode() != null) {
				this.fila.add(node.getRightNode());
			}
		}

		Node firstNode = this.fila.poll();
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
