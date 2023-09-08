package recursion;

public class R7CountDigit {
    //Count number of 7 in the number.
    //count7(717) → 2
    //count7(7) → 1
    //count7(123) → 0

    public static int count7(int n) {
        //Base Condition
        if(n == 0){
            return 0;
        }
        //Recursive Solution.
        int r = n%10;
        if(r == 7){
            return 1 + count7(n/10);
        }
        return count7(n/10);
    }

    public static void main(String[] args) {
        System.out.println(count7(777177));
    }
}
