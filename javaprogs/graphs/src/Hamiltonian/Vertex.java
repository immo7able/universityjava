package Hamiltonian;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    boolean visited;
    List<Vertex> neighbours;
    Vertex parent;



    public Vertex(String name) {
        this.name = name;
        neighbours = new ArrayList<>();
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    public List<Vertex> getNeighbours() {
        return neighbours;
    }
    public boolean isNeighbour(Vertex a){
        for(Vertex v: a.getNeighbours()){
            if(v==this)
                return true;
        }
        return false;
    }

    public void addNeighbours(Vertex neighbour) {
        neighbours.add(neighbour);
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
