package Strings;
class reversewordinastring {
    public String reverseWords(String s) {
        String st[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<st.length-1;i++){
            temp.append(st[i]).reverse().append(" ");
            sb.append(temp);
            temp.setLength(0);
        }
        temp.append(st[st.length-1]).reverse();
        sb.append(temp);
        return sb.toString();

       
    }
}
//leetcode 557