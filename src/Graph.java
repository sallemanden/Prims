import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class Graph {
    int[][] edgeMatrix;
    int[][] weightMatrix;
    int numberVert;

    public Graph(int numberVert) {
        this.edgeMatrix = new int[numberVert][numberVert];
        this.weightMatrix = new int[numberVert][numberVert];
        this.numberVert = numberVert;
    }

    public void addEdge(int from, int to, int weight) {
        this.edgeMatrix[from][to] = 1;
        this.weightMatrix[from][to] = weight;
    }

    public void printMatrixGraph() {
        for (int from = 0; from < numberVert; from++) {
            for (int to = 0; to < numberVert; to++) {
                if (edgeMatrix[from][to] == 1) {
                    System.out.println("From " + from + ", To " + to + ", Distance " + weightMatrix[from][to] + " km");
                }
            }
        }
        System.out.println("\n");
    }

    public void PrimsMST() {
        int[] D = new int[edgeMatrix.length];
        int[] P = new int[edgeMatrix.length];
        MyHeap<Pair> Q = new MyHeap<>();
        Pair[] VertexPairs = new Pair[edgeMatrix.length];

        for (int i = 0; i < edgeMatrix.length; i++) {
            D[i] = Integer.MAX_VALUE;
            P[i] = -1;
            Pair newPair = new Pair(D[i], i);
            Q.insert(newPair);
            VertexPairs[i] = newPair;
        }
        if (D.length > 0) {
            D[0] = 0;
        }
        int pos = Q.getPosition(VertexPairs[0]);
        VertexPairs[0].distance = 0;
        Q.decreasekey(pos);
        int MST = 0;
        while (!Q.isEmpty()) {
            Pair u = Q.extractMin();
            for (int v = 0; v < numberVert; v++) {
                if (edgeMatrix[u.index][v] == 1 && weightMatrix[u.index][v] < D[v]) {
                    D[v] = weightMatrix[u.index][v];
                    P[v] = u.index;
                    pos = Q.getPosition(VertexPairs[v]);
                    VertexPairs[v].distance = D[v];
                    Q.decreasekey(pos);
                }
            }
            MST += D[u.index];
            System.out.println("From: " + P[u.index] + ", To " + u.index + ", Distance " + D[u.index] + " km");
        }
        System.out.println("\nTotal (shortest) distance: " + MST);
        System.out.println("Total price (for shortest distance): " + (MST * 100000) + " Kr.");

    }
}

class Pair implements Comparable<Pair> {
    Integer distance;
    Integer index;

    public Pair(int distance, int index) {
        this.distance = distance;
        this.index = index;
    }

    @Override
    public int compareTo(Pair o) {
        return distance.compareTo(o.distance);
    }
}
