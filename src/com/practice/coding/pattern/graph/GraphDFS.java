package com.practice.coding.pattern.graph;

import java.util.*;

class GraphDFS {
    private int vertices;
    private List<List<Integer>> adjList;

    public GraphDFS(int vertices) {
        this.vertices = vertices;
        this.adjList = new ArrayList<>(vertices);
        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v1,int v2){
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    public void DFS(int start){
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        while (!stack.isEmpty()){
            int curr = stack.pop();
            System.out.println("visited: "+ curr);
            List<Integer> neighbours = adjList.get(curr);
            for(int neighbour: neighbours){
                if(!visited[neighbour]){
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

    public void BFS(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()){
            int curr = queue.poll();
            System.out.println("visited: "+ curr);
            List<Integer> neighbours = adjList.get(curr);
            for(int neighbour: neighbours){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
}

class Solution {
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        graph.BFS(0);


    }
}
