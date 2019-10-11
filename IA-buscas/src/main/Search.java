package main;

import node.Node;
import searches.AbstractSearch;
import searches.BreadthFirstSearch;

public class Search {

	public static void main(String[] args) {

		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);

		node0.setLeftNode(node1);
		node0.setRightNode(node2);

		node1.setLeftNode(node3);
		node1.setRightNode(node4);

		node2.setLeftNode(node5);
		node2.setRightNode(node6);

		AbstractSearch search = new BreadthFirstSearch(node0, 6);
		search.search();

	}

}
