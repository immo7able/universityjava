package Kruskal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Kruskal {
    List<Edge> edges;
    Vertex[] vertices;
    public Kruskal(Vertex[] vertices, List<Edge> edges){
        this.edges = edges;
        this.vertices = vertices;
    }
    public void kruskal() {
        int sum=0;
        for(Vertex a: vertices){
            a.setParent(a);
        }
        for(int i=0;i<edges.size();i++){
            if(findParent(edges.get(i).getV1())!=findParent(edges.get(i).getV2())){
                if(findParent(edges.get(i).getV1())!=edges.get(i).getV1().getParent())
                    setAllParents(edges.get(i).getV1(), findParent(edges.get(i).getV2()));
                else{
                    setAllParents(edges.get(i).getV2(), findParent(edges.get(i).getV1()));
                }
                sum+=edges.get(i).getWeight();
            }

        }
        System.out.println(sum);
    }
    public Vertex findParent(Vertex a){
        if(a.getParent()==a)
            return a;
        return findParent(a.getParent());
    }
    public void setAllParents(Vertex a, Vertex b){
        if(a.getParent()==a){
            a.setParent(b);
        }
        else setAllParents(a.getParent(),b);
    }
}
