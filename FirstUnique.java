//Find the first non-repeating value in an array

import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    int[] arr = {12,1,3,3,2,12,5};
    int res = firstUnique(arr);
    if(res < 0)
      System.out.println("The array has only repeating numbers");
    else
      System.out.println("The first non-repeating number is: " + res);
  }
  
  public static int firstUnique(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < arr.length; i++) {
      if(map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      }
      else {
        map.put(arr[i], 1);
      }
    }
    for(int i = 0; i < arr.length; i++) {
      if(map.get(arr[i] )== 1)
         return arr[i];
    }
    return -1;
  }
}