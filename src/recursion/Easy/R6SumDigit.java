package recursion.Easy;

public class R6SumDigit {
    //sumDigits(126) → 9
    //sumDigits(49) → 13
    //sumDigits(12) → 3
    public static int sumDigits(int n) {
        //Base condition
        if(n == 0){
            return 0;
        }
        //Sum of digit  = number%10 (remainder) + sum(n/10) (for quotient)
        int sum = n%10 + sumDigits(n/10);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(8));
    }
}
