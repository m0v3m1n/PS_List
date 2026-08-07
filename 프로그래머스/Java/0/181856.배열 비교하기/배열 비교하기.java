class Solution
{
    public int solution(int[] arr1, int[] arr2)
    {
        if(arr1.length != arr2.length)
            return arr1.length > arr2.length ? 1 : -1;
        else
        {
            int s1 = 0, s2 = 0;
            
            for(int t : arr1)
                s1 += t;
            for(int t : arr2)
                s2 += t;
            
            return s1 > s2 ? 1 : s1 == s2 ? 0 : -1;
        }
    }
}