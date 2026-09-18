class Solution
{
    public String solution(String my_string, int[] indices)
    {
        StringBuilder S = new StringBuilder(my_string);
        
        for(int i = 0; i < indices.length; i++)
            S.setCharAt(indices[i], ' ');
        
        return S.toString().replaceAll(" ", "");
    }
}