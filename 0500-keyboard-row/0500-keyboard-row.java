import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
       ArrayList<String> an=new ArrayList<>();
       for(String word :words)
       {
        if(word.matches("[qwertyuiopQWERTYUIOP]+")||
        word.matches("[asdfghjklASDFGHJKL]+") ||
        word.matches("[zxcvbnmZXCVBNM]+"))
        {
        an.add(word); 
        }
       } 
    
    return an.toArray(new String[0]);
}
}