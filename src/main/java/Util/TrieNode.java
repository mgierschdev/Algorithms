package Util;

/*
Problem: Represent trie nodes for word and prefix algorithms.
Goal: Provide storage for 26-way branching and optional word marker.
Approach: Fixed-size child array and a word field set by builders like Utils.buildTrie.
Time: O(1) access per child index.
Space: O(26) per node instance.
Tags: trie, data-structure
*/
public class TrieNode {
    public TrieNode[] nodes = new TrieNode[26];
    public String word;
}
