class Solution
{
    public int solution(String binomial)
    {
        int a, b, idx = 0;
        while('0' <= binomial.charAt(idx) && binomial.charAt(idx) <= '9')
            idx++;
        
        a = Integer.parseInt(binomial.substring(0, idx));
        b = Integer.parseInt(binomial.substring(idx + 3, binomial.length())); // 공백, 연산자, 공백
        
        if(binomial.charAt(idx + 1) == '+')
            return a + b;
        else if(binomial.charAt(idx + 1) == '-')
            return a - b;
        else
            return a * b;
    }
}