package Strings;

public class validpalindrome {
   
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int size=sb.length();
        boolean status=true;
        for(int i=0;i<size/2;i++){
            if(sb.charAt(i)!=sb.charAt(size-i-1)){
                status=false;
                break;
            }
        }
        return status;
    }
}

