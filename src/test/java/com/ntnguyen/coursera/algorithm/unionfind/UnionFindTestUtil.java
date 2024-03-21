package com.ntnguyen.coursera.algorithm.unionfind;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnionFindTestUtil {

    public static void runTestSuite(UnionFind uf) {
        // Make sure nothing is connected
        for (int i = 0; i < 9; i++) {
            assertFalse(uf.isConnected(i, i + 1));
        }

        uf.union(4, 5);
        uf.union(5, 9);
        assertTrue(uf.isConnected(4, 9));

        uf.union(9, 2);
        assertTrue(uf.isConnected(4, 2));


        uf.union(9, 6);
        assertTrue(uf.isConnected(6, 2));
        assertTrue(uf.isConnected(6, 5));
        assertTrue(uf.isConnected(6, 4));
        assertFalse(uf.isConnected(1, 9));

        uf.union(4, 1);
        assertTrue(uf.isConnected(1, 9));
    }
}
