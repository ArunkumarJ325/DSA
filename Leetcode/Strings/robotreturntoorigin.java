package Strings;

public class robotreturntoorigin {
    
    public boolean judgeCircle(String moves) {
        int ar[]={0,0};
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                ar[0]++;
            }
            if(moves.charAt(i)=='D'){
                ar[0]--;
            }
            if(moves.charAt(i)=='R'){
                ar[1]++;
            }
            if(moves.charAt(i)=='L'){
                ar[1]--;
            }

        }
        
        if(ar[1]==0 && ar[0]==0) return true;
        return false;
    }
}
//leetcode 657

