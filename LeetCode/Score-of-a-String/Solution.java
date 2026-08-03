1class Solution {
2    public int scoreOfString(String s) {
3        int score=0;
4        for(int i=0;i<s.length()-1;i++){
5            int a=s.charAt(i);
6            int b=s.charAt(i+1);
7            if(a>b)
8            score=score+(a-b);
9            else
10            score=score+(b-a);
11        }
12        return score;
13
14    }
15}