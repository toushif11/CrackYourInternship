class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int i = Math.abs(num);
            if (nums[i] < 0)
                return i;
            nums[i] = -nums[i];
        }
        return n;
    }
}
//Time complexity - O(n)
//Space complexity - O(1)

// class Solution {
// public int findDuplicate(int[] nums) {
// HashSet<Integer> set = new HashSet<>();
// int n = nums.length;
// for(int i = 0;i<n;i++){
// if(!set.add(nums[i])) return nums[i];
// }
// return n;
// }
// }

// //Time complexity - O(n)
// //Space Complexity - O(n)
