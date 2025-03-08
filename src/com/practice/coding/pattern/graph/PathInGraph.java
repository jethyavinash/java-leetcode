package com.practice.coding.pattern.graph;

import java.util.ArrayList;
import java.util.List;

public class PathInGraph {
    private static boolean[] visited ;
    public static void main(String[] args) {
        boolean result = validPath(4, new int[][]{{0,1},{1,2},{2,3}}, 0, 3);
        System.out.println("is valid path present ? "+result);
    }

    private static boolean validPath(int n, int[][] edges, int start, int end) {
        boolean isValidPath = false;
        List<List<Integer>> adjacencyList = createAdjList(n,edges);
        visited = new boolean[n];
        isValidPath = dfs(adjacencyList,start,end);

        return isValidPath;
    }

    private static boolean dfs(List<List<Integer>> adjacencyList, int node, int end) {
        if(node == end) return true;
        visited[node] = true;

        for(int neighbour : adjacencyList.get(node)){
            if(!visited[neighbour] && dfs(adjacencyList,neighbour,end)){
                return true;
            }
        }
        return false;
    }

    private static List<List<Integer>> createAdjList(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        return adjList;
    }
}
