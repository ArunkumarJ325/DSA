package Strings;

public class decryptstring {
    
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                int n1=s.charAt(i)-'0';
                int n2=s.charAt(i+1)-'0';
                n1=n1*10+n2;
                sb.append((char)(n1+'a'-1));
                i+=3;           
            }
            
            else{
                char ch=s.charAt(i);
                sb.append((char)(ch-'0'+'a'-1));
                i++;
            }
        }
        return sb.toString();
        
    }
}
//leetcode 1309

