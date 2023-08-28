package string;

public class S1 {
    public static void main(String[] args) {

        String s="Hello";

        //Java create a string in the string pool in the heap memory.
        //When create same string using String str then it creates a memory for one string and point two string in the same memory location.
        //When create a string using String str = new String ("Hello") then it will create a separate memory in the heap.
        //Even if the two string is same still it will create a new memory location when we create string using new keyword.

        String s1=new String("Hello");
        System.out.println(s);
        System.out.println(s1);

        String str = "Hello World";
        System.out.println("The character at index 6 is "+str.charAt(6));

        //ASCII encodes symbols, digits, letters, etc., whereas Unicode encodes special texts from different languages, letters, symbols, etc
        char ch = str.charAt(6);
        int ascii = ch;
        int ascii1 = (int) ch;
        System.out.println("The ascii value of a character is "+ascii);
        System.out.println("The ascii value of a character is "+ascii1);

        //Compare two strings lexicographically.
        //They are equal if they have the same length and contain the same characters in the same positions
        String compareString1 = "Hello";
        String compareString2 = "Hello1";
        int res = compareString1.compareTo(compareString2);
        System.out.println(res);
        //The compareTo method returns an integer value that indicates the relationship between the two strings.
        //Negative integer: If the current string (compareString1) is lexicographically less than the anotherString(compareString2).
        //Zero: If the current string is lexicographically equal to the anotherString.
        //Positive integer: If the current string is lexicographically greater than the anotherString.
    }
}
