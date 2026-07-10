1class Solution {
2    public boolean isPalindrome(int x) {
3        int org=x;
4        int rev=0;
5        while(x>0){
6            int q =x%10;
7            rev=rev*10+q;
8            x=x/10;
9        }
10        return rev==org;
11    }
12}