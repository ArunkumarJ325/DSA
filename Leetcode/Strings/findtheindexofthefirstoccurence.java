package Strings;

public class findtheindexofthefirstoccurence {
   
    public int strStr(String haystack, String needle) {
        int start=0,end=needle.length();
        if(needle.length()>haystack.length()) return -1;
        while(end<=haystack.length()){
            if(haystack.substring(start,end).equals(needle)){
                return start;
            }
            else{
                start++;
                end++;
            }
        }
        return -1;
        
        
    }
}
//leetcode 28

