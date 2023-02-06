//The Java String class concat() method combines specified string at the end of this string. It returns a combined string. It is like appending another string.

public class ConcatExample{    
    public static void main(String args[]){    
    String s1="java string";    
    // The string s1 does not get changed, even though it is invoking the method      
    // concat(), as it is immutable. Therefore, the explicit assignment is required here.  
    s1.concat("is immutable");    
    System.out.println(s1);    
    s1=s1.concat(" is immutable so assign it explicitly");    
    System.out.println(s1);    
    }} 