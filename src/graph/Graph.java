package graph;

import linear.Bag;

/**
 * 无向图实现
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

    // 深复制给定图
    public Graph(Graph origin){
        this(origin.V());

        // 遍历所有定点，建立所有的边
        // 复杂度为 定点数X度
        for(int i=0;i<V;i++)
            for(int w : origin.adj(i))
                this.addEdge(i, w);
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;    // 平行边算同一条

        // 若不允许出现平行边和自环
        // 则要判断v!=w  ===> 排除自环
        // 只添加v-w，并且添加之前判断是否存在w-v
    }

    public Iterable<Integer> adj(int v){
        return adj(v);
    }

    // 习4.1.4
    public boolean hasEdge(int v, int w){
        // 直接遍历其中一者的所有相邻节点
        for(int k : adj(v))
            if (k == w)
                return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
