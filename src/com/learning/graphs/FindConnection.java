package com.learning.graphs;

import java.util.LinkedList;

/**
 * Created by vijayperiasamy on 2/22/17.
 */
public class FindConnection {

    enum State{VISITED, UNVISITED;}

    static boolean isConnected(Graph graph, Node start, Node target) {
        if (null == graph || null == start || null == target) return false;

        for (Node node: graph.nodes) {
            node.state = State.UNVISITED;
        }

        LinkedList<Node> queue =  new LinkedList<Node>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            if (temp.data == target.data) {
                return true;
            }
            temp.state = State.VISITED;
            for (Node node: temp.adjNodes) {
                if (!(node.state == State.VISITED)) {
                    queue.add(node);
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {

    }
}
