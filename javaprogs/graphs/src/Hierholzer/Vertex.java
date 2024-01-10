package Hierholzer;



import java.util.ArrayList;
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
    public Edge getEdge(List<Edge> edges){
        for(Edge e: edges){
            if((e.getVertex1()==this||e.getVertex2()==this)&&e.isVisited()==false)
                return e;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
