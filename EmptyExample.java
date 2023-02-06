//The Java String class isEmpty() method checks if the input string is empty or not. Note that here empty means the number of characters contained in a string is zero.

public class IsEmptyExample {  
    public static void main(String[] args) {  
        String s1="";    
        String s2="Yash";             
        // Either length is zero or isEmpty is true  
        if(s1.length()==0 || s1.isEmpty())  
            System.out.println("String s1 is empty");  
        else System.out.println("s1");        
        if(s2.length()==0 || s2.isEmpty())  
            System.out.println("String s2 is empty");  
        else System.out.println(s2);  
    }  
}  