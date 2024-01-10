package Dijkstra;

import java.util.*;

public class Dijkstra {
    Vertex start;
    Vertex end;

    public Dijkstra(Vertex start, Vertex end){
        this.start = start;
        this.end = end;
    }

    public void dijkstra(){
        PriorityQueue<Vertex> pq = new PriorityQueue<>((a,b)->{return a.getValue()-b.getValue();});

        pq.add(start);


        while (!pq.isEmpty()){
            Vertex curr = pq.poll();
            for (Map.Entry<Vertex, Integer> map: curr.getNeighbours().entrySet()){
                if (!map.getKey().isVisited()){
                    if(curr.getValue()+map.getValue()<map.getKey().getValue())
                        map.getKey().setValue(curr.getValue()+map.getValue());
                    pq.add(map.getKey());
                }
            }
            curr.setVisited(true);
            if(curr==end) {
                System.out.println(curr.getName() + " " + curr.getValue());
                break;
            }
        }
    }
}
