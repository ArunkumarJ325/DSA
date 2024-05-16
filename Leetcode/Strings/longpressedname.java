package Strings;

public class longpressedname {
    
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()) return false;
        int index=0,i=0;
        while(i<typed.length()){
            if(index<name.length() && typed.charAt(i)==name.charAt(index)){
                i++;
                index++;
            }
            else if(i>0 && typed.charAt(i)==typed.charAt(i-1)){
                i++;
            }
            else{
                return false;
            }
        }
        return index==name.length();
    }
}
//leetcode 925

