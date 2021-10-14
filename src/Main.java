public class Main {

    public static void main(String[] args) {
        Graph thisGraph1 = new Graph(16);
        thisGraph1.addEdge(0, 7, 28);
        thisGraph1.addEdge(0, 10, 13);
        thisGraph1.addEdge(0, 15, 25);
        thisGraph1.addEdge(1, 6, 60);
        thisGraph1.addEdge(1, 5, 24);
        thisGraph1.addEdge(1, 8, 25);
        thisGraph1.addEdge(1, 11, 19);
        thisGraph1.addEdge(1, 12, 47);
        thisGraph1.addEdge(1, 13, 48);
        thisGraph1.addEdge(1, 14, 34);
        thisGraph1.addEdge(1, 15, 40);
        thisGraph1.addEdge(2, 3, 34);
        thisGraph1.addEdge(2, 4, 44);
        thisGraph1.addEdge(2, 6, 66);
        thisGraph1.addEdge(2, 11, 36);
        thisGraph1.addEdge(2, 12, 32);
        thisGraph1.addEdge(2, 13, 46);
        thisGraph1.addEdge(2, 14, 34);
        thisGraph1.addEdge(3, 6, 94);
        thisGraph1.addEdge(3, 5, 58);
        thisGraph1.addEdge(3, 11, 56);
        thisGraph1.addEdge(3, 12,33 );
        thisGraph1.addEdge(3, 13, 74);
        thisGraph1.addEdge(3, 14, 63);
        thisGraph1.addEdge(4, 11, 62);
        thisGraph1.addEdge(4, 12, 70);
        thisGraph1.addEdge(4, 13, 39);
        thisGraph1.addEdge(4, 14, 51);
        thisGraph1.addEdge(6, 8, 45);
        thisGraph1.addEdge(6, 13, 20);
        thisGraph1.addEdge(5, 8, 45);
        thisGraph1.addEdge(5, 11, 28);
        thisGraph1.addEdge(5, 12, 25);
        thisGraph1.addEdge(5, 15, 60);
        thisGraph1.addEdge(7, 9, 27);
        thisGraph1.addEdge(7, 10, 26);
        thisGraph1.addEdge(8, 12, 57);
        thisGraph1.addEdge(8, 11, 26);
        thisGraph1.addEdge(8, 13, 37);
        thisGraph1.addEdge(8, 14, 32);
        thisGraph1.addEdge(8, 15, 28);
        thisGraph1.addEdge(11, 12, 31);
        thisGraph1.addEdge(11, 14, 15);
        thisGraph1.addEdge(11, 15, 58);
        thisGraph1.addEdge(13, 14, 14);

        thisGraph1.printMatrixGraph();
        thisGraph1.PrimsMST();
    }
}
