class Solution
{
    public int solution(String number)
    {
        int sum = 0;
        char[] arr = number.toCharArray();
        
        for(char c : arr)
            sum += (c - '0');
        
        return sum % 9;
    }
}