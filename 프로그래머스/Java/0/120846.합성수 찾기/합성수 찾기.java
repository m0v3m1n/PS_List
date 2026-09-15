class Solution
{
    public int solution(int n)
    {
        int cnt = 0;
        int[] arr = new int[101];
        
        for(int i = 2; i <= 100; i++)
            for(int j = 2; j <= 100; j++)
            {
                if(i * j > 100)
                    break;
                
                arr[i * j] = 1;
            }
        
        for(int i = 1; i <= n; i++)
            if(arr[i] == 1)
                cnt++;
        
        return cnt;
    }
}