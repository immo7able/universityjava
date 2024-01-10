package Kruskal;

import java.util.HashMap;

public class Vertex {
    String name;
    boolean visited;
    Vertex parent;

    public Vertex(String name) {
        this.name = name;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public boolean isVisited(){
        return visited;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
