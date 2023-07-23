package com.ntnguyen.leetcode;

public class ZigzagConversion6 {
    public static void main(String[] args) {
        ZigzagConversion6 o = new ZigzagConversion6();

        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(o.calculateColumns(s, numRows));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        return "";
    }

    private int calculateColumns(String s, int numRows) {
        int l = s.length();
        int colNumInACompleteBlock = numRows - 1;
        int charsInACompleteBlock = 2 * numRows - 2;

        int completedBlock = l / charsInACompleteBlock;
        int charsInAllCompletedBlock = completedBlock * charsInACompleteBlock;

        int charsLeft = l - charsInAllCompletedBlock;
        int additionalColumn = charsLeft > 0 ? 1 : 0;

        int singleCharColumn = charsLeft % numRows;

        return l/charsInACompleteBlock*colNumInACompleteBlock + additionalColumn + singleCharColumn;
    }
}
