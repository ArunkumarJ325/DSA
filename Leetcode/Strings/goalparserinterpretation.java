package Strings;

public class goalparserinterpretation {
    
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append('G');
            }
            else if((i+1)<command.length() && command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append('o');
            }
            else if(command.charAt(i)=='a'){
                sb.append('a');
            }
            if(command.charAt(i)=='l'){
                sb.append('l');
            }
        }
        return sb.toString();
        
    }
}
    //leetcode 1678

