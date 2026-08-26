1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5
6        HashSet<Integer> s1 = new HashSet<>();
7        for(int n1 : nums1){
8            s1.add(n1);
9        }
10        HashSet<Integer> s2 = new HashSet<>();
11        for(int n2 : nums2){
12            s2.add(n2);
13        }
14        HashSet<Integer> s3 = new HashSet<>();
15        for(int num : nums1){
16            if(s2.contains(num)){
17                s3.add(num);
18            }
19        }
20        int[] result = new int[s3.size()];
21        int i = 0;
22        for(int num : s3){
23            result[i++] = num;
24        }
25        return result;
26    }
27}