package com.ntnguyen.coursera.algorithm.unionfind;

import java.util.List;

public interface UnionFind {

    void union(int p, int q);

    boolean isConnected(int p, int q);

    List<Integer> getBucket();
}
