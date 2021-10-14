public class Main {

    public static void main(String[] args) {
        Graph thisGraph1 = new Graph(7);
        thisGraph1.addEdge(0, 1, 1);
        thisGraph1.addEdge(0, 2, 5);
        thisGraph1.addEdge(0, 4, 3);
        thisGraph1.addEdge(1, 4, 1);
        thisGraph1.addEdge(1, 5, 7);
        thisGraph1.addEdge(2, 3, 1);
        thisGraph1.addEdge(3, 4, 1);
        thisGraph1.addEdge(3, 6, 1);
        thisGraph1.addEdge(4, 2, 1);
        thisGraph1.addEdge(4, 3, 3);
        thisGraph1.addEdge(4, 5, 3);
        thisGraph1.addEdge(4, 6, 4);
        thisGraph1.addEdge(5, 6, 1);

        thisGraph1.printMatrixGraph();
        thisGraph1.PrimsMST();
    }
}
