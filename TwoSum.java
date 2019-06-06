//Two Sum - Find Two Numbers that Add up to "n"
import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 5};
    int target = 10;
    int[] res = twoSum(nums, target);
    if(res == null) {
      System.out.println("No valid result satisfying the target");
      return;
    }
    System.out.println("The numbers are : " + res[0] + " , " + res[1]);
  }
  
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
    int complement;
    for(int i = 0; i < nums.length; i++) {
      if(map.containsValue(target - nums[i])) {
        complement = target - nums[i];
        return new int[]{ map.get(complement), nums[i]};
      }
      else {
        map.put(nums[i],nums[i]);
      }
    }
    return null;
  }
}