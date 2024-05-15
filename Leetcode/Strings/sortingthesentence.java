package Strings;

public class sortingthesentence {
   
    public String sortSentence(String s) {
        String st[]=s.split(" ");
        String[] result=new String[st.length];
        int index=0;
        for(int i=0;i<st.length;i++){
            index=(int)(st[i].charAt(st[i].length()-1)-'0');
            result[index-1]=st[i].substring(0,st[i].length()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.length-1;i++){
            sb.append(result[i]).append(" ");
        }
        sb.append(result[result.length-1]);
        return sb.toString();
    }
}

//leetcode 1859

