//The Java String class getBytes() method does the encoding of string into the sequence of bytes and keeps it in an array of bytes.

public class StringGetBytesExample{  
    public static void main(String args[]){  
    String s1="ABCDEFG";  
    byte[] barr=s1.getBytes();  
    for(int i=0;i<barr.length;i++){  
    System.out.println(barr[i]);  
    }  
    }}  