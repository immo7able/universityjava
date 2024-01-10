package Kruskal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex A =new Vertex("A");
        Vertex B =new Vertex("B");
        Vertex C =new Vertex("C");
        Vertex D =new Vertex("D");
        Vertex E =new Vertex("E");
        Vertex F =new Vertex("F");
        Vertex G =new Vertex("G");
        Vertex[] vertices = {A,B,C,D,E,F,G};
        List<Edge> edges = new ArrayList<Edge>(List.of(
                new Edge(A, B, 2),
                new Edge(A, F, 10),
                new Edge(A, C, 6),
                new Edge(A, E, 5),
                new Edge(F, C, 2),
                new Edge(C, D, 1),
                new Edge(F, G, 5),
                new Edge(G, D, 5),
                new Edge(D, E, 4),
                new Edge(B, D, 3),
                new Edge(B, E, 3)
                ));
        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight-o2.weight;
            }
        });
        Kruskal kruskal = new Kruskal(vertices, edges);
        kruskal.kruskal();
    }
}
