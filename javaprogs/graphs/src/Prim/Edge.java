package Prim;

import java.util.Set;

public class Edge {
    Vertex vertex1;
    Vertex vertex2;
    int weight;

    public Edge(Vertex vertex1, Vertex vertex2, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
        vertex1.addEdge(this);
        vertex2.addEdge(this);
    }

    public Vertex getOtherVertex(Set<String> visited) {
        if (visited.contains(vertex1.name)) {
            return vertex2;
        } else if (visited.contains(vertex2.name)) {
            return vertex1;
        } else {
            return null;
        }
    }
}

