class Solution
{
    public int solution(int[] arr, int idx)
    {
        int res = -1;
        
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == 1)
                if(res < idx)
                    res = i;
                else
                    break;
        
        return res >= idx ? res : -1;
    }
}