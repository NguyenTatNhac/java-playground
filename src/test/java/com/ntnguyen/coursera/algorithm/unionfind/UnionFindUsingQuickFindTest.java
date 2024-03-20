package com.ntnguyen.coursera.algorithm.unionfind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnionFindUsingQuickFindTest {

    @Test
    public void testUnionFinQuickFind() {
        UnionFindUsingQuickFind uf = new UnionFindUsingQuickFind(10);

        System.out.println(uf.getBucket());
        // Make sure nothing is connected
        for (int i = 0; i < 9; i++) {
            assertFalse(uf.isConnected(i, i + 1));
        }

        uf.union(4, 5);
        System.out.println(uf.getBucket());
        uf.union(5, 9);
        System.out.println(uf.getBucket());
        assertTrue(uf.isConnected(4, 9));

        uf.union(9, 2);
        System.out.println(uf.getBucket());
        assertTrue(uf.isConnected(4, 2));
    }
}