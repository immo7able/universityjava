package Hierholzer;


import java.util.Set;

public class Edge {
    Vertex vertex1;
    Vertex vertex2;
    boolean visited;

    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        vertex1.addEdge(this);
        vertex2.addEdge(this);
        this.visited=false;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
    }
    public Vertex getOtherVertex(Vertex a) {
        if (this.getVertex1()==a) {
            return vertex2;
        } else if (this.getVertex2()==a) {
            return vertex1;
        } else {
            return null;
        }
    }
}
