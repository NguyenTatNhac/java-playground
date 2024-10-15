package com.ntnguyen.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _22_Generate_Parentheses {

  public static void main(String[] args) {
    System.out.println(new _22_Generate_Parentheses().generateParenthesis(3));
  }

  public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    dfs(res, 0, 0, "", n);
    return res;
  }

  public void dfs(List<String> res, int open, int close, String s, int n) {
    if (s.length() == n * 2) {
      res.add(s);
      return;
    }

    if (open < n) {
      dfs(res, open + 1, close, s + "(", n);
    }

    if (close < open) {
      dfs(res, open, close + 1, s + ")", n);
    }
  }
}
