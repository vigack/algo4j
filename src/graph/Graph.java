package graph;

import linear.Bag;

/**
 * Created by liang on 2017/11/28.
 */
public class Graph {

    private final int V;            // 顶点数
    private int E;                  // 边数
    private Bag<Integer>[] adj;     // 邻接表

    public Graph(int V){
        this.V = V;
        this.E = 0;

        adj = new Bag[V];
        for(int v=0;v<V;V++)
            adj[v] = new Bag<>();
    }

//    public Graph(InputStream in){}

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj(v);
    }


    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
