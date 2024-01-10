package Prim;

import java.util.*;

public class Prim {
    List<Vertex> vertices;
    List<Edge> edges;
    public Prim(List<Vertex> vertices, List<Edge> edges){
        this.vertices = vertices;
        this.edges = edges;
    }
    public void prim() {
        int sum=0;
        Set<String> visited = new HashSet<>();
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        Vertex startVertex = vertices.get(0);
        visited.add(startVertex.name);
        priorityQueue.addAll(startVertex.edges);

        while (!priorityQueue.isEmpty()) {
            Edge edge = priorityQueue.poll();
            Vertex currentVertex = edge.getOtherVertex(visited);

            if (currentVertex != null && !visited.contains(currentVertex.name)) {
                visited.add(currentVertex.name);
                sum+=edge.weight;

                priorityQueue.addAll(currentVertex.edges);
            }
        }
        System.out.println(sum);
    }

}