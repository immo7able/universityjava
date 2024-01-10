
import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    List<Vertex> neighbours;
    boolean visited;
    boolean isbeingVisited;

    public Vertex(String name) {
        this.name = name;
        neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex v){
        neighbours.add(v);
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public void setisBeingVisited(boolean isbeingVisited) {
        this.isbeingVisited = isbeingVisited;
    }

    public boolean isVisited(){
        return visited;
    }

    public String getName(){
        return name;
    }

    public List<Vertex> getNeighbours(){
        return neighbours;
    }

    public boolean isbeingVisited() {
        return isbeingVisited;
    }
}
