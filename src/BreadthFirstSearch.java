import java.util.LinkedList;
import java.util.Iterator;

class BreadthFirstSearch {
 
    private int vertex;
    private LinkedList<Integer> adjecencyList[];
 
    BreadthFirstSearch(int vertex)
    {
        this.vertex = vertex;
        this.adjecencyList = new LinkedList[vertex];
        for (int i = 0; i < vertex; ++i)
        this.adjecencyList[i] = new LinkedList();
    }
 
    void addEdge(int vertex, int weight) { 
        this.adjecencyList[vertex].add(weight); 
    }
 
    void BFS(int source)
    {
        boolean visited[] = new boolean[this.vertex];
 
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[source] = true;
        queue.add(source);
 
        while (queue.size() != 0) {
            source = queue.poll();
            System.out.print(source + " ");

            Iterator<Integer> i = adjecencyList[source].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    public static void main(String args[])
    {
        BreadthFirstSearch graph = new BreadthFirstSearch(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
 
        System.out.println(
            "Following is Breadth First Traversal "
            + "(starting from vertex 2)");
 
        graph.BFS(2);
    }
}
 