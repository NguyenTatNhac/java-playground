package com.ntnguyen.coursera.algorithm.unionfind;

import java.util.Arrays;
import java.util.List;

/**
 * Union Find using Quick Find. Quick Find union operation is too slow.
 */
public class UnionFindUsingQuickFind implements UnionFind {

    private final int[] ids;

    public UnionFindUsingQuickFind(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if (isConnected(p, q)) {
            return;
        }

        int source = ids[p];
        int target = ids[q];

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == source) {
                ids[i] = target;
            }
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return ids[p] == ids[q];
    }

    @Override
    public List<Integer> getBucket() {
        return Arrays.stream(ids).boxed().toList();
    }
}
