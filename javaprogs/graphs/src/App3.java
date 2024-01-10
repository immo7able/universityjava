import java.util.LinkedList;

public class App3 {
    public static void main(String[] args) {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        A.addNeighbour(D);
        A.addNeighbour(F);
        B.addNeighbour(F);
        B.addNeighbour(E);
        D.addNeighbour(C);
        C.addNeighbour(E);
        LinkedList<Vertex> list = new LinkedList<Vertex>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        list.add(E);
        list.add(F);
        TopologicalSort ts = new TopologicalSort(list, A);
        ts.ts();
    }
}
