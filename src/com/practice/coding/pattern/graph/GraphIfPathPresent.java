package com.practice.coding.pattern.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphIfPathPresent {
    public static void main(String[] args) {
        int vertices = 4;
        int[][] edges = new int[][]{{0,1},{0,2},{1,0},{1,3},{2,0},{2,3},{3,1},{3,2}};
        int start = 0;
        int end = 3;
        boolean result = isPathExist(vertices,edges,start,end);
        System.out.println(result);
    }

    private static boolean isPathExist(int vertices, int[][] edges, int start, int end) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[vertices];
        return dfs(graph,start,end,visited);


    }

    public static boolean dfs(List<List<Integer>> graph, int start, int end, boolean[] visited) {
        System.out.println("111");
        if(start == end){
            System.out.println("222");
            return true;
        }
        visited[start] = true;
        for(int neighbour : graph.get(start)){
            if(!visited[neighbour]){
                if(GraphIfPathPresent.dfs(graph,neighbour,end,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
