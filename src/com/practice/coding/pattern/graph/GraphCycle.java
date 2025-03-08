package com.practice.coding.pattern.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphCycle {
    private  static Map<Integer, List<Integer>> ajdList = null;
    private  static boolean[] visited;
    private  static boolean[] pathVisitedStack;
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,-1);

        System.out.println(graph);
        boolean isCyclic = isCyclicGraph(graph);
        System.out.println(isCyclic);
    }

    private static boolean isCyclicGraph(Graph graph) {
        ajdList = graph.getAjdList();
        int mapSize = ajdList.size();
        boolean[] visited = new boolean[mapSize];
        boolean[] pathVisitedStack = new boolean[mapSize];
        for(Integer vertex: ajdList.keySet()){
            if(hasCycle(vertex,visited,pathVisitedStack))
                return true;
        }
        return false;
    }

    private static boolean hasCycle(Integer vertex, boolean[] visited, boolean[] pathVisitedStack) {
        if(pathVisitedStack[vertex]){
            return true;
        }

        if(visited[vertex]){
            return false;
        }

        visited[vertex] = true;
        pathVisitedStack[vertex] = true;

        for(Integer childVertex : ajdList.get(vertex)){
            if(hasCycle(childVertex,visited,pathVisitedStack))
                return true;
        }

        pathVisitedStack[vertex] = false;
        return false;
    }
}

class Graph{
    Map<Integer, List<Integer>> ajdList;

    public Graph(){
        ajdList = new HashMap<>();
    }

    public void addEdge(int src,int dest){
        if(ajdList.get(src) == null){
            ajdList.put(src,new ArrayList<>());
            ajdList.get(src).add(dest);
        }else {
            ajdList.get(src).add(dest);
        }
    }

    public Map<Integer, List<Integer>> getAjdList() {
        return ajdList;
    }

    public void setAjdList(Map<Integer, List<Integer>> ajdList) {
        this.ajdList = ajdList;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "ajdList=" + ajdList +
                '}';
    }}
