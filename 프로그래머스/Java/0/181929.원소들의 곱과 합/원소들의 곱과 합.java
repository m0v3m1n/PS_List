class Solution
{
    public int solution(int[] num_list)
    {
        int d, m = 1, s = 0;
        for(int i = 0; i < num_list.length; i++)
        {
            m *= num_list[i];
            s += num_list[i];
        } s *= s;
        
        return m < s ? 1 : 0;
    }
}