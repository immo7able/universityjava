package Prim;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vertex> vertices = Arrays.asList(new Vertex("A"), new Vertex("B"), new Vertex("C"), new Vertex("D"), new Vertex("E"),new Vertex("F"),new Vertex("G"));

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(vertices.get(0), vertices.get(1), 2));
        edges.add(new Edge(vertices.get(0), vertices.get(4), 5));
        edges.add(new Edge(vertices.get(0), vertices.get(2), 6));
        edges.add(new Edge(vertices.get(0), vertices.get(5), 10));
        edges.add(new Edge(vertices.get(1), vertices.get(3), 3));
        edges.add(new Edge(vertices.get(1), vertices.get(4), 3));
        edges.add(new Edge(vertices.get(2), vertices.get(3), 1));
        edges.add(new Edge(vertices.get(2), vertices.get(5), 2));
        edges.add(new Edge(vertices.get(5), vertices.get(6), 5));
        edges.add(new Edge(vertices.get(6), vertices.get(3), 5));
        edges.add(new Edge(vertices.get(3), vertices.get(4), 4));
        Prim prim = new Prim(vertices, edges);
        prim.prim();
    }
}
