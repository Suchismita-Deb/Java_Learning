package recursion.Easy;

public class R8CountDigit {
    //Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit.
    //Except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
    //count8(8) → 1
    //count8(818) → 2
    //count8(8818) → 4

    //Not done.
    public static int count8(int n) {
        //Base Condition.
        if(n == 0){
            return 0;
        }
        //Recursive Function
        int r = n%10;
        n = n/10;
        int r1 = n%10;
        n=n/10;
        if(r == 8 && r1 == 8){
            return 2 + count8(n/10);
        }
        if(r == 8){
            return 1 + count8(n/10);
        }
        return count8(n/10);
    }

    public static void main(String[] args) {
        System.out.println(count8(8818898));
    }
}
