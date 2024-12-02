package com.practice.coding.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TrieNode {
    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode(){
        this.children = new TrieNode[26];
        this.isEndOfWord = false;
    }

}
public class TrieImpl {
    private TrieNode root;
    public TrieImpl(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;
        for(char c : word.toCharArray()){
            if(node.children[c-'a'] == null){
                node.children[c-'a'] = new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word){
        TrieNode node = root;
        for(char c : word.toCharArray()){
            if(node.children[c - 'a'] == null){
                return false;
            }
            node = node.children[c - 'a'];
        }
        return node.isEndOfWord;
    }

    public boolean hasPrefix(String prefix){
        TrieNode node = root;
        for(char c : prefix.toCharArray()){
            if(node.children[c - 'a'] == null){
                return false;
            }
            node = node.children[c -'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        /*TrieImpl trie = new TrieImpl();
        trie.insert("apple");
        System.out.println(trie.hasPrefix("appe"));*/
        TrieImpl trie = new TrieImpl();
        trie.insert("pro");
        trie.insert("is");
        trie.insert("fun");
        trie.insert("gram");
        String text = "programmingisfun";
        List<List<Integer>> indexPairs = findIndexPairs(trie,text);
        System.out.println(indexPairs);
    }

    private static List<List<Integer>> findIndexPairs(TrieImpl trie, String text) {
        List<List<Integer>> pairs = new ArrayList<>();
        for(int i = 0;i<text.length();i++){
            TrieNode rootNode = trie.root;
            for(int j = i ; j< text.length();j++){
                char currChar = text.charAt(j);
                if(rootNode.children[currChar-'a'] == null){
                    break;
                }
                rootNode = rootNode.children[currChar-'a'];
                if(rootNode.isEndOfWord){
                    pairs.add(Arrays.asList(i,j));
                }
            }
        }
        return pairs;
    }
}
