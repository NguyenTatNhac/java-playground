package com.ntnguyen.coursera.algorithm.unionfind;

import org.junit.Test;

public class UnionFindUsingWeightedQuickUnionTest {

    @Test
    public void testWeightedUnion() {
        UnionFindUsingWeightedQuickUnion uf = new UnionFindUsingWeightedQuickUnion(10);
        UnionFindTestUtil.runTestSuite(uf);
    }
}