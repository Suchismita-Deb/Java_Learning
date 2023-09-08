package recursion;

public class R14NoX {
    //noX("xaxb") → "ab"
    //noX("abc") → "abc"
    //noX("xx") → ""

    public static String noX(String str) {
        //Base condition.
        if(str.length() == 0){
            return str;
        }

        //Recursive Solution
        if(str.charAt(0) == 'x'){
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(noX("xyxyxy"));
    }
}
