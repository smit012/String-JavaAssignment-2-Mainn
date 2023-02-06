//The Java String class getChars() method copies the content of this string into a specified char array.

public class StringGetCharsExample{  
    public static void main(String args[]){  
     String str = new String("hello java how r u");  
          char[] ch = new char[10];  
          try{  
             str.getChars(6, 16, ch, 0);  
             System.out.println(ch);  
          }catch(Exception ex){System.out.println(ex);}  
    }}  