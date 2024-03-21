package com.ntnguyen.coursera.algorithm.unionfind;

import org.junit.Test;

public class UnionFindUsingQuickFindTest {

    @Test
    public void testUnionFindQuickFind() {
        UnionFindUsingQuickFind uf = new UnionFindUsingQuickFind(10);

        UnionFindTestUtil.runTestSuite(uf);
    }
}