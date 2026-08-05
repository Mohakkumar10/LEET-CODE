1import java.util.Arrays;
2class Solution {
3    public boolean isAnagram(String s, String t) {
4        if(s.length()!=t.length()){
5            return false;
6        }
7        char a[]=s.toCharArray();
8        char b[]=t.toCharArray();
9        Arrays.sort(a);
10        Arrays.sort(b);
11        return Arrays.equals(a,b);
12
13    }
14}