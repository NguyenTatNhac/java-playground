package com.ntnguyen.coursera.algorithm.unionfind;

import java.util.List;

public class UnionFindUsingWeightedQuickUnion implements UnionFind {
    private final int[] ids;
    private final int [] size;

    public UnionFindUsingWeightedQuickUnion(int n) {
        ids = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = i;
            size[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootQ == rootP) {
            return;
        }

        if (size[rootP] > size[rootQ]) {
            ids[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            ids[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public List<Integer> getBucket() {
        return null;
    }

    private int root(int n) {
        while (n != ids[n]) {
            /* when finding the root, for each node, we want
             * to re-pointed that node directly to the parent.
             * This optimization called path compression. */
            ids[n] = ids[ids[n]]; // optimize
            n = ids[n];
        }
        return n;
    }
}
