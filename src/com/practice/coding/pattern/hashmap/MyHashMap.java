package com.practice.coding.pattern.hashmap;

import java.util.Objects;

public class MyHashMap<K,V> {
    private int capacity;
    private int currSize;
    private Entry[] table;
    private static class Entry<K, V>{
        K key;
        V value;
        public Entry(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap(int capacity){
        this.capacity = capacity;
        this.currSize = 0;
        this.table = new Entry[capacity];
    }

    private int hash(K key){
        return Objects.hashCode(key) % capacity;
    }

    public boolean put(K key,V value){
        if(this.capacity == this.currSize){
            return false;
        }
        int index = hash(key);
        table[index] = new Entry<>(key,value);
        currSize++;
        return true;
    }

    public V get(K key){
        int index = hash(key);
        Entry<K,V> entry = this.table[index];
        if(entry != null && entry.key.equals(key)){
            return entry.value;
        }
        return null;
    }

    public boolean remove(K key){
        int index = hash(key);
        Entry<K,V> entry = this.table[index];
        if(entry != null && entry.key.equals(key)){
            table[index] = null;
            currSize --;
            return true;
        }
        return false;
    }

    public void print(){
        for(int i = 0 ; i<this.capacity ; i++){
            Entry<K,V> entry = table[i];
            if(entry != null){
                System.out.println("Key: "+entry.key +" Value: "+entry.value);
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap(5);
        myHashMap.put(1, "A");
        myHashMap.put(2, "B");
        myHashMap.put(3, "C");
        myHashMap.put(4, "D");
        myHashMap.put(5, "E");
        myHashMap.remove(3);
        System.out.println(myHashMap.get(3));
        myHashMap.print();
    }
}
