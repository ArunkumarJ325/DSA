package Strings;

class valid {
    public boolean isNumber(String s) {
        boolean digit=false;
        boolean exp=false;
        boolean dot=false;
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                digit=true;
            }
            else if(s.charAt(i)=='E' || s.charAt(i)=='e'){
                if(exp || !digit ){
                    return false;
                }
                exp=true;
                digit=false;
            }
            else if(s.charAt(i)=='.'){
                if( dot || exp ){
                    return false;
                }
                dot=true;
                

            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                if(i>0 && s.charAt(i-1)!='E'  &&  s.charAt(i-1)!='e'){
                    return false;
                }
                
            }
            else{
                return false;
            }

            
        }
        return digit;

        
    }
}