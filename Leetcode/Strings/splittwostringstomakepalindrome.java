package Strings;

public class splittwostringstomakepalindrome {
    
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
    
    public boolean check(String a,String b){
        int i=0,j=b.length()-1;
        //System.out.print(j);
        while(i<j && a.charAt(i)==b.charAt(j)){
            i++;
            j--;
        }
        return (i>=j)? true : palindrome(a,i,j)||palindrome(b,i,j);
    }

    public boolean palindrome(String s,int i,int j){
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

