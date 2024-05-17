package Strings;

public class mergestirngsalternately {
   
    public String mergeAlternately(String word1, String word2) {
        int index=0;
        StringBuilder sb=new StringBuilder();
        while(index<Math.min(word1.length(),word2.length())){
            sb.append(word1.charAt(index)).append(word2.charAt(index));
            index++;
        } 
        int index2=index; 
        if(index!=word1.length()){
            while(index!=word1.length()){
                sb.append(word1.charAt(index));
                index++;
            }
        }
        if(index2!=word2.length()){
             while(index2!=word2.length()){
                sb.append(word2.charAt(index2));
                index2++;
             }
        }
        return sb.toString();
        
    }
}

