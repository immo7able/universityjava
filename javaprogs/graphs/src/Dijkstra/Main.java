package Dijkstra;

public class Main {
    public static void main(String[] args) {
        Vertex A = new Vertex("A", 0);
        Vertex B = new Vertex("B", Integer.MAX_VALUE);
        Vertex C = new Vertex("C",Integer.MAX_VALUE);
        Vertex D = new Vertex("D",Integer.MAX_VALUE);
        Vertex E = new Vertex("E",Integer.MAX_VALUE);
        Vertex F = new Vertex("F", Integer.MAX_VALUE);
        Vertex G = new Vertex("G", Integer.MAX_VALUE);
        Vertex H = new Vertex("H", Integer.MAX_VALUE);

        A.addNeighbour(B, 5);
        A.addNeighbour(H, 8);
        A.addNeighbour(E, 9);

        B.addNeighbour(C, 12);
        B.addNeighbour(D,15);
        B.addNeighbour(H,4);

        E.addNeighbour(H,5);
        E.addNeighbour(F,4);
        E.addNeighbour(G,20);

        H.addNeighbour(C,7);
        H.addNeighbour(F,6);

        F.addNeighbour(C,1);
        F.addNeighbour(G,13);

        C.addNeighbour(D,3);
        C.addNeighbour(G,11);

        D.addNeighbour(G, 9);

        Dijkstra dijkstra = new Dijkstra(A, G);
        dijkstra.dijkstra();
    }
}
