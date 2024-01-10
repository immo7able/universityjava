package NarxozCycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex2 {
    String name;
    List<Vertex2> neighbours;
    boolean visited;
    boolean beingVisited;

    public Vertex2(String name){
        this.name = name;
        neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex2 v){
        neighbours.add(v);
    }

    public String getName() {
        return name;
    }

    public List<Vertex2> getNeighbours() {
        return neighbours;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }
}
