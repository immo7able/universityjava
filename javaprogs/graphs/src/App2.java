public class App2 {
    public static void main(String[] args) {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        A.addNeighbour(C);
        A.addNeighbour(E);
        C.addNeighbour(B);
        C.addNeighbour(D);
        E.addNeighbour(F);
        F.addNeighbour(A);
        CycleDetection cycleDetection = new CycleDetection(A);
        cycleDetection.dfs(A);
    }
}
