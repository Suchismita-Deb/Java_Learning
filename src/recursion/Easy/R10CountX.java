package recursion.Easy;

public class R10CountX {
    //countX("xxhixx") → 4
    //countX("xhixhix") → 3
    //countX("hi") → 0
    public static int countX(String str) {
        //Base Condition
        if(str.length() == 0){
            return 0;
        }

        //Recursive Solution
        if(str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
    }
}
