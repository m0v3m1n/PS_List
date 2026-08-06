class Solution
{
    public int solution(int[] num_list, int n)
    {
        for(int searching : num_list)
            if(searching == n)
                return 1;
        
        return 0;
    }
}