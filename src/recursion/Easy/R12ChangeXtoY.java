package recursion.Easy;

public class R12ChangeXtoY {
    //changeXY("codex") → "codey"
    //changeXY("xxhixx") → "yyhiyy"
    //changeXY("xhixhix") → "yhiyhiy"
    public static String changeXToY(String str) {
        //Base Condition
        if(str.length() == 0){
            return str;
        }
        //Recursive Function
        if(str.charAt(0) == 'x'){
            return 'y' + changeXToY(str.substring(1));
        }
        return str.charAt(0) + changeXToY(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(changeXToY("codex"));
    }

}
