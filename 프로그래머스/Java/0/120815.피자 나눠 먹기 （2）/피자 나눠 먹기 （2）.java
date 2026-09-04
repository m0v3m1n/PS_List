class Solution
{
    public int solution(int n)
    { 
        int n2 = n, m = 6;
        
        while(m > 0)
        {
            int tmp = m;
            m = n % m;
            n = tmp;
        }
        
        return (n2 * 6) / n / 6;
    }
}