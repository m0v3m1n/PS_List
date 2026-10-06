class Solution
{
    public String solution(String letter)
    {
        StringBuilder S = new StringBuilder();
        String[] mos = letter.split(" ");
        
        for(int i = 0; i < mos.length; i++)
            if(mos[i].equals(".-"))
                S.append("a");
            else if(mos[i].equals("-..."))
                S.append("b");
            else if(mos[i].equals("-.-."))
                S.append("c");
            else if(mos[i].equals("-.."))
                S.append("d");
            else if(mos[i].equals("."))
                S.append("e");
            else if(mos[i].equals("..-."))
                S.append("f");
            else if(mos[i].equals("--."))
                S.append("g");
            else if(mos[i].equals("...."))
                S.append("h");
            else if(mos[i].equals(".."))
                S.append("i");
            else if(mos[i].equals(".---"))
                S.append("j");
            else if(mos[i].equals("-.-"))
                S.append("k");
            else if(mos[i].equals(".-.."))
                S.append("l");
            else if(mos[i].equals("--"))
                S.append("m");
            else if(mos[i].equals("-."))
                S.append("n");
            else if(mos[i].equals("---"))
                S.append("o");
            else if(mos[i].equals(".--."))
                S.append("p");
            else if(mos[i].equals("--.-"))
                S.append("q");
            else if(mos[i].equals(".-."))
                S.append("r");
            else if(mos[i].equals("..."))
                S.append("s");
            else if(mos[i].equals("-"))
                S.append("t");
            else if(mos[i].equals("..-"))
                S.append("u");
            else if(mos[i].equals("...-"))
                S.append("v");
            else if(mos[i].equals(".--"))
                S.append("w");
            else if(mos[i].equals("-..-"))
                S.append("x");
            else if(mos[i].equals("-.--"))
                S.append("y");
            else if(mos[i].equals("--.."))
                S.append("z");
        
        return S.toString();
    }
}