package Strings;

public class reverseprefixofword {
    
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        StringBuilder sb=new StringBuilder();
        sb.append(word.substring(0,index+1));
        sb.reverse();
        sb.append(word.substring(index+1));
        return sb.toString();
        
    }
}
