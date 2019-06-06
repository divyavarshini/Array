//Array of Products of All Elements Except Itself
//Given an array, return an array where each index stores the product of all numbers except the number on the index itself.

import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int[] res = arrayProd(nums);
    for(int i = 0; i < res.length; i++)
      System.out.print(res[i] + " ");
    System.out.println();
  }
  
  public static int[] arrayProd(int nums[]) {
    int[] res = new int[nums.length];
    for(int i = 0; i < nums.length; i++) {
      int prod = 1;
      for(int j = 0; j < nums.length; j++) {
        if(i != j)
          prod = prod * nums[j];
      }
      res[i] = prod;
    }
    return res;
  }
}