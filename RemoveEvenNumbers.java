//Remove Even Integers from Array

class Solution {
  public static void main(String[] args) {
    int[] test = {1, 2, 3, 4 ,5};
    int[] res = removeEvenNumbers(test);
    for(int i = 0; i < res.length; i++)
      System.out.print(res[i] + " ");
    System.out.println();
  }
  
  public static int[] removeEvenNumbers(int[] nums) {
    int[] res = new int[nums.length];
    int k = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] % 2 != 0)  {
        res[k++] = nums[i];
      }
    }
    int[] ans = new int[k];
    for(int i = 0; i < k; i++) {
      ans[i] = res[i];
    }
    return ans;
  }
}