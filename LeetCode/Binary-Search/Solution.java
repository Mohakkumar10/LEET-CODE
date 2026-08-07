1class Solution {
2    public int search(int[] nums, int target) {
3        int start = 0;
4        int end = nums.length - 1;
5
6        while (start <= end) {
7            int mid = (start + end) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12            else if (nums[mid] < target) {
13                start = mid + 1;
14            }
15            else {
16                end = mid - 1;
17            }
18        }
19
20        return -1;
21    }
22}