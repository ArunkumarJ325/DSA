package Strings;
import java.util.List;
public class countitemsmatchingarule {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       
        int count=0;
        for(int i=0;i<items.size();i++){
            List <String> list=items.get(i);
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))){
                count++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))){
                count++;
            }   
            else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))){
                count++;
            }     
        
    }
    return count;
    }
}
//leetcode 1773

