package com.practice.coding.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GraphCustom {
    private Map<Integer, List<Integer>> adjacencyList;
    public GraphCustom(Map<Integer,List<Integer>> adjacencyList){
        this.adjacencyList = adjacencyList;
    }

    public void addVertex(int vertex){
        if(!adjacencyList.containsKey(vertex)){
            adjacencyList.put(vertex, new ArrayList<>());
        }
    }

    public void removeVertex(int vertex){
        if(!adjacencyList.containsKey(vertex)){
            return;
        }
        adjacencyList.remove(vertex);
        for(List<Integer> neighbours : adjacencyList.values()){
            neighbours.removeIf(v -> v == vertex);
        }
    }

    public void addEdges(int v1 , int v2){
        if(adjacencyList.containsKey(v1) && adjacencyList.containsKey(v2)){
            adjacencyList.get(v1).add(v2);
            adjacencyList.get(v2).add(v1);
        }
    }

    public void removeEdges(int v1,int v2){
        adjacencyList.get(v1).removeIf(v -> v == v1);
        adjacencyList.get(v2).removeIf(v -> v == v2);
    }

    public ArrayList<Integer> getAllVertices(){
        return new ArrayList(adjacencyList.keySet());
    }

    public List<Integer> getNeighbours(int v){
        return new ArrayList<>(adjacencyList.getOrDefault(v, new ArrayList<>()));
    }

    public boolean isAdjacent(int v1,int v2){
        List<Integer> neighbours = adjacencyList.get(v1);
        return neighbours.contains(v2);
    }

    public int getVertexCount(){
        return adjacencyList.size();
    }

    public int getEdgeCount(){
        int count = 0;
        for(List<Integer> neighbours : adjacencyList.values()){
            count += neighbours.size();
        }
        return count/2;
    }



}
