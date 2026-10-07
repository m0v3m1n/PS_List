class Solution
{
    public int solution(String my_string)
    {
        int res = 0;
        
        String number = my_string.replaceAll("[a-zA-Z]", " ").trim();
        if(number.isEmpty())
            return 0;
        
        String[] numbers = number.split("\\s+");
        for(int i = 0; i < numbers.length; i++)
            res += Integer.parseInt(numbers[i]);
        
        return res;
    }
}