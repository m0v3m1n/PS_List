class Solution
{
    public String solution(String my_string, int num1, int num2)
    {
        StringBuilder S = new StringBuilder();
        S.append(my_string);
        
        S.setCharAt(num1, my_string.charAt(num2));
        S.setCharAt(num2, my_string.charAt(num1));
        
        return S.toString();
    }
}