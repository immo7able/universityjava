package Kruskal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Vertex A =new Vertex("A");
        Vertex B =new Vertex("B");
        Vertex C =new Vertex("C");
        Vertex D =new Vertex("D");
        Vertex E =new Vertex("E");
        Vertex F =new Vertex("F");
        Vertex G =new Vertex("G");
        Vertex H =new Vertex("H");
        Vertex[] vertices = {A,B,C,D,E,F,G,H};
        List<Edge> edges = new ArrayList<Edge>(List.of(
                new Edge(A, C, 5),
                new Edge(A, B, 3),
                new Edge(B, D, 4),
                new Edge(C, D, 12),
                new Edge(D, E, 9),
                new Edge(D, H, 8),
                new Edge(E, H, 1),
                new Edge(G, H, 20),
                new Edge(E, G, 5),
                new Edge(E, F, 4),
                new Edge(F, G, 6)
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
