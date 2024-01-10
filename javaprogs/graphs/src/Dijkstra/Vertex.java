package Dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vertex {
    String name;
    int value;
    HashMap<Vertex, Integer> neighbours;
    boolean visited;

    public Vertex(String name, int value) {
        this.name = name;
        neighbours = new HashMap<Vertex, Integer>();
        this.value=value;
    }
    public void addNeighbour(Vertex v, int dist){
        neighbours.put(v, dist);
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    public boolean isVisited(){
        return visited;
    }
    public String getName(){
        return name;
    }
    public HashMap<Vertex, Integer> getNeighbours(){
        return neighbours;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}

