package Hierholzer;




import java.util.List;
import java.util.Stack;

public class Hierholzer {
    List<Vertex> vertices;
    List<Edge> edges;
    public Hierholzer(List<Vertex> vertices, List<Edge> edges){
        this.vertices = vertices;
        this.edges = edges;
    }
    public void hierholzer(Vertex start){
        Stack<Vertex> stack1 = new Stack<>();
        Stack<Vertex> stack2 = new Stack<>();
        stack1.add(start);
        while(!stack1.isEmpty()){
            for(Edge e:edges){
                if(!e.isVisited()&&e.getOtherVertex(stack1.peek())!=null)
                    stack1.add(e.getOtherVertex(stack1.peek()));
                else stack2.add(stack1.pop());
            }
        }
        for(int i=0;i<stack1.size();i++){
            System.out.println(stack1.get(i).getName());
        }
    }
}
