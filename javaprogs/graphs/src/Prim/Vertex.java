package Prim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vertex {
    String name;
    List<Edge> edges;

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    @Override
    public String toString() {
        return name;
    }
}
