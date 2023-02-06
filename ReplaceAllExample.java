//The Java String class replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.

public class ReplaceAllExample{  
    public static void main(String args[]){  
    String s1="java is a very good language";  
    String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
    System.out.println(replaceString);  
    }}  