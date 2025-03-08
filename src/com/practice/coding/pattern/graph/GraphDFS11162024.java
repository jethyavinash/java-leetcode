package com.practice.coding.pattern.graph;

import java.util.*;

public class GraphDFS11162024 {
    private List<List<Integer>> adjList;
    private int vertices;

    public GraphDFS11162024(int vertices){
        this.vertices = vertices;
        this.adjList = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v){
        adjList.get(u).add(v);
    }

    public void DFS(int start){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];
        stack.push(start);
        visited[start] = true;
        while (!stack.isEmpty()){
            int curr = stack.pop();
            System.out.print(curr+" ");
            for(int neighbour : adjList.get(curr)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    stack.push(neighbour);
                }
            }
        }
    }

    public void BFS(int start){
        System.out.println();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr+" ");
            for(Integer neighbour : adjList.get(curr)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        GraphDFS11162024 g = new GraphDFS11162024(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        g.DFS(0);
        g.BFS(0);

    }


}
