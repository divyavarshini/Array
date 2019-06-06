//Merge Two Sorted Arrays
import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    int[] nums1 = {};
    int[] nums2 = {2,4,5,6};
    int[] res = mergeSortedArray(nums1, nums2);
    for(int i = 0; i < res.length; i++) {
      System.out.print(res[i] + " ");
    }
    System.out.println();
  }
  
  public static int[] mergeSortedArray(int[] nums1, int[] nums2) {
    int[] res = new int[(nums1.length) + (nums2.length)];
    int k = 0;
    int i = 0;
    int j = 0;
    while((i < nums1.length) && (j < nums2.length)) {
      if(nums1[i] <= nums2[j])
        res[k++] = nums1[i++];
      else
        res[k++] = nums2[j++];
    }
    while(i < nums1.length) {
      res[k++] = nums1[i++];
    }
    while(j < nums2.length) {
      res[k++] = nums2[j++];
    }
    return res;
  }
}