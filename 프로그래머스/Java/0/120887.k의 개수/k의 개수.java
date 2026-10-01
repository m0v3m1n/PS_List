class Solution
{
    public int solution(int i, int j, int k)
    {
        int cnt = 0;
        
        for(int n = i; n <= j; n++)
            cnt += Integer.toString(n).length() - Integer.toString(n).replace(Integer.toString(k), "").length();
        // 111144 -> 1111, 6 - 4 = 2개
        
        return cnt;
    }
}