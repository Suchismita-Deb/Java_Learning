package recursion.Easy;

public class R11CountHi {
    //countHi("xxhixx") → 1
    //countHi("xhixhix") → 2
    //countHi("hi") → 1
    public static int countHi(String str) {
        //Base Condition
        if(str.length() == 0){
            return 0;
        }
        if(str.length()-1 == 0){
            return 0;
        }

        //Recursive Function
        if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countHi("xxhihi"));
    }

}
