class Solution
{
    public int solution(int[][] arr)
    {
        int flag = 1;
        
        for(int i = 0; i < arr.length; i++)
            for(int j = i; j < arr.length; j++)
                if(arr[i][j] != arr[j][i])
                    flag = 0;
        
        return flag;
    }
}