package Strings;

class checktwostringequivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1=new StringBuilder();
        StringBuilder w2=new StringBuilder();
        for(String s:word1){
            w1.append(s);
        }
        for(String s:word2){
            w2.append(s);
        }
        String s1=w1.toString();
        String s2=w2.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
//leetcode1662