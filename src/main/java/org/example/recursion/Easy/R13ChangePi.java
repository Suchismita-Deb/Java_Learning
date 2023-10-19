package org.example.recursion.Easy;

public class R13ChangePi {
    //changePi("xpix") → "x3.14x"
    //changePi("pipi") → "3.143.14"
    //changePi("pip") → "3.14p"

    public static String changePi(String str) {
        //Base Condition
        if(str.length() == 0){
            return str;
        }

        if(str.length()-1 == 0){
            return str;
        }

        //Recursive Function
        if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(changePi("pixpi"));
    }
}
