package com.ntnguyen.coursera.algorithm.unionfind;

import java.util.List;

public class UnionFindUsingQuickUnion implements UnionFind {

    private final int [] ids;

    public UnionFindUsingQuickUnion(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        ids[rootP] = rootQ;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public List<Integer> getBucket() {
        return null;
    }

    private int root(int i) {
        while (i != ids[i]) {
            i = ids[i];
        }
        return i;
    }
}
