public class CycleDetection {
    Vertex start;
    public CycleDetection(Vertex start){
        this.start=start;
    }
    public void dfs(Vertex curr){
        curr.setisBeingVisited(true);
        for(Vertex v: start.getNeighbours()){
            if(v.isbeingVisited()){
                System.out.println("There is a cycle");
                return;
            }
            if(!v.isVisited()){
                dfs(v);
            }
            curr.setVisited(true);
            curr.setisBeingVisited(false);
            System.out.println(curr.getName());
        }
    }
}
