//The Java String class startsWith() method checks if this string starts with the given prefix. It returns true if this string starts with the given prefix; else returns false.

public class StartsWithExample2 {    
    public static void main(String[] args) {    
        String str = "Java";    
        // no offset mentioned; hence, offset is 0 in this case.  
        System.out.println(str.startsWith("J")); // True    
  
         // no offset mentioned; hence, offset is 0 in this case.  
        System.out.println(str.startsWith("a")); // False   
        // offset is 1  
        System.out.println(str.startsWith("a",1)); // True    
    }    
}    