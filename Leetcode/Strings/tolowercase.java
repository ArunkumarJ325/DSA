package Strings;

public class tolowercase {
    
    public String toLowerCase(String s) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if('A'<=ch[i] && ch[i]<='Z'){
                ch[i]=(char)(ch[i]-'A'+'a');
            }
        }
        return new String(ch);
    }
}
//Leetcode 709

