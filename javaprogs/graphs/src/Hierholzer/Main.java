package Hierholzer;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex A= new Vertex("A");
        Vertex B= new Vertex("B");
        Vertex C= new Vertex("C");
        Vertex D= new Vertex("D");
        Vertex E= new Vertex("E");
        Vertex F= new Vertex("F");
        List<Vertex> vertices = new ArrayList<>(List.of(A,B,C,D,E,F));
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(A, B));
        edges.add(new Edge(A, C));
        edges.add(new Edge(B, E));
        edges.add(new Edge(B, F));
        edges.add(new Edge(B, D));
        edges.add(new Edge(C, D));
        edges.add(new Edge(D, E));
        edges.add(new Edge(D, F));
        Hierholzer hierholzer = new Hierholzer(vertices, edges);
        hierholzer.hierholzer(A);
    }
}
