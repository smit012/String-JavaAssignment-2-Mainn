//The Java String class lastIndexOf() method returns the last index of the given character value or substring. If it is not found, it returns -1. The index counter starts from zero.

public class LastIndexOfExample{  
    public static void main(String args[]){  
    String s1="this is index of example";//there are 2 's' characters in this sentence  
    int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
    System.out.println(index1);//6  
    }}  