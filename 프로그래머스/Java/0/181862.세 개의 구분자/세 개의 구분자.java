class Solution
{
    public String[] solution(String myStr)
    {
        String str = myStr.replaceAll("[a-c]", " ").trim();
        
        if(str.isEmpty())
            return new String[]{"EMPTY"};
        else
            return str.split("\\s+");
    }
}