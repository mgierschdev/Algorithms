package Util;

/*
Problem: Represent a comparable player record for sorting exercises.
Goal: Hold name and score fields used by comparator-based algorithms.
Approach: Simple data carrier with public fields and constructor; comparator logic lives externally.
Time: O(1) access to fields.
Space: O(1) per instance.
Tags: sorting, data-structure
*/
public class Player {
    public String name;
    public int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
