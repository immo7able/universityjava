package Hamiltonian;

import java.util.HashSet;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        A.addNeighbours(B);
        A.addNeighbours(C);
        A.addNeighbours(D);
        B.addNeighbours(A);
        B.addNeighbours(C);
        B.addNeighbours(F);
        B.addNeighbours(E);
        C.addNeighbours(A);
        C.addNeighbours(B);
        C.addNeighbours(D);
        C.addNeighbours(F);
        D.addNeighbours(A);
        D.addNeighbours(C);
        D.addNeighbours(F);
        E.addNeighbours(B);
        E.addNeighbours(F);
        F.addNeighbours(D);
        F.addNeighbours(C);
        F.addNeighbours(B);
        F.addNeighbours(E);
        HashSet<Vertex> all = new HashSet<>();
        all.add(A);
        all.add(B);
        all.add(C);
        all.add(D);
        all.add(E);
        all.add(F);
        Stack<Vertex> visited = new Stack<>();
        backtrack(A, visited, all);
    }
    private static void backtrack(Vertex curr, Stack<Vertex> path, HashSet<Vertex> all) {
        path.add(curr);
        curr.setVisited(true);
        if(path.size()==all.size()&&curr.isNeighbour(path.get(0))){
            System.out.println("Путь: ");
            for(Vertex v: path){
                System.out.print(v.getName()+" ");
            }
            System.out.println();
            return;
        }
        for(Vertex v: curr.getNeighbours()){
            if(!v.isVisited()&&!path.contains(v)) {
                v.setVisited(true);
                backtrack(v, path, all);
                path.remove(v);
                v.setVisited(false);
            }
        }
    }
}
