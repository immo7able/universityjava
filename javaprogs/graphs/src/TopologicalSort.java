import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    Vertex start;
    LinkedList list;
    Stack<Vertex> stack = new Stack<Vertex>();
    public TopologicalSort(LinkedList list, Vertex start){
        this.start = start;
        this.list = list;
    }

    public void tsort(Vertex curr){
        for(Vertex v:curr.getNeighbours()){
            if(v.getNeighbours().isEmpty()&&!v.isVisited()) {
                v.setVisited(true);
                stack.push(v);
            }
        }
        if(!curr.isVisited()){
            curr.setVisited(true);
            stack.push(curr);
        }
}
    public void ts() {
        while (!list.isEmpty()){
            Vertex curr = (Vertex) list.pop();
            if(curr.getNeighbours()!=null)
                tsort(curr);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().getName());
        }
    }
}

