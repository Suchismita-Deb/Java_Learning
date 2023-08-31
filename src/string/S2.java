package string;

public class S2 {
    public static void main(String[] args) {

        //contains() method checks whether a string contains a sequence of characters.
        String str1 = "DSA and Algorithm";
        String str2 = "and";
        // check if one string is present in another string.
        System.out.println(str1.contains(str2)); // true if str1 contains str2.

        // Check if two string is equal.
        String str3 = "Java";
        String str4 = "java";
        boolean result = str3.equals(str4);
        System.out.println(result);

        //For char we can put equal sign to check.
        char ch='j';
        char ch1='j';
        if(ch==ch1)
            System.out.println("Char equal.");
        else
            System.out.println("Char not equal.");
    }
}
