//The Java String class equalsIgnoreCase() method compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string. It is just like the equals() method but doesn't check the case sensitivity. If any character is not matched, it returns false, else returns true.

public class EqualsIgnoreCaseExample{  
    public static void main(String args[]){  
    String s1="java";  
    String s2="java";  
    String s3="JAVA";  
    String s4="python";  
    System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
    System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
    System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
    }}  