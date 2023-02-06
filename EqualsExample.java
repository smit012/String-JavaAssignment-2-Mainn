//The Java String class equals() method compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.

public class EqualsExample{  
    public static void main(String args[]){  
    String s1="yash";  
    String s2="yash";  
    String s3="YASH";  
    String s4="Meet";  
    System.out.println(s1.equals(s2));//true because content and case is same  
    System.out.println(s1.equals(s3));//false because case is not same  
    System.out.println(s1.equals(s4));//false because content is not same  
    }}  