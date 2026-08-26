1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5
6        Arrays.sort(nums1);
7        Arrays.sort(nums2);
8
9        HashSet<Integer> s1 = new HashSet<>();
10        for(int n1 : nums1){
11            s1.add(n1);
12        }
13        HashSet<Integer> s2 = new HashSet<>();
14        for(int n2 : nums2){
15            s2.add(n2);
16        }
17        HashSet<Integer> s3 = new HashSet<>();
18        for(int num : nums1){
19            if(s2.contains(num)){
20                s3.add(num);
21            }
22        }
23        int[] result = new int[s3.size()];
24        int i = 0;
25        for(int num : s3){
26            result[i++] = num;
27        }
28        return result;
29    }
30}