import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
	
	private LinkedList<Integer> adjecencyList[];
	private boolean visited[];
	
	DepthFirstSearch(int numberOfVertices) {
		this.adjecencyList = new LinkedList[numberOfVertices];
		this.visited = new boolean[numberOfVertices];
		
		for (int i=0; i < numberOfVertices; i++) {
			this.adjecencyList[i] = new LinkedList<Integer>();
		}
	}
	
	private void insertEdge(int source, int destination) {
		this.adjecencyList[source].add(destination);
	}
	
	private void DFS(int vertex) {
		visited[vertex] = true;
		System.out.println(vertex + "");
		
		Iterator<Integer> iterator = this.adjecencyList[vertex].listIterator();
		while (iterator.hasNext()) {
			int n = iterator.next();
			if (!visited[n]) {
				DFS(n);
			}
		}
	}
	
	

	public static void main(String[] args) {
		DepthFirstSearch graph =  new DepthFirstSearch(8);
		
	    graph.insertEdge(0, 1);    
        graph.insertEdge(0, 2);    
        graph.insertEdge(0, 3);    
        graph.insertEdge(1, 3);    
        graph.insertEdge(2, 4);  
        graph.insertEdge(3, 5);       
        graph.insertEdge(3, 6);    
        graph.insertEdge(4, 7);    
        graph.insertEdge(4, 5);    
        graph.insertEdge(5, 2); 
        
        System.out.println("Depth First Traversal for the graph is:");   
        
        graph.DFS(0);
	}

}
