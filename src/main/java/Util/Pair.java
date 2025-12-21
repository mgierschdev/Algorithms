package Util;

/*
Problem: Store two related values for algorithms that need tuple-like return types.
Goal: Simple generic holder for heterogeneous pairs.
Approach: Public fields initialized via constructor; no extra behavior.
Time: O(1) access to stored values.
Space: O(1) per pair instance.
Tags: tuple, utility
*/
public class Pair<T1, T2> {
    public T1 val1;
    public T2 val2;

    public Pair(T1 val1, T2 val2){
        this.val1 = val1;
        this.val2 = val2;
    }
}
