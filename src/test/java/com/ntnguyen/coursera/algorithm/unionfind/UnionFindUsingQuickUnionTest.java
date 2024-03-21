package com.ntnguyen.coursera.algorithm.unionfind;

import org.junit.Test;

public class UnionFindUsingQuickUnionTest {

    @Test
    public void quickUnionTest() {
        UnionFindTestUtil.runTestSuite(new UnionFindUsingQuickUnion(10));
    }
}