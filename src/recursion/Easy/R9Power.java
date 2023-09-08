package recursion.Easy;

public class R9Power {
    //powerN(3, 1) → 3
    //powerN(3, 2) → 9
    //powerN(3, 3) → 27
    public static int powerN(int base, int n) {
        if(n == 1){
            return base;
        }
        if(n == 0){
            return 1;
        }
        return base * powerN(base,n-1);
    }

    public static void main(String[] args) {
        System.out.println(powerN(5,3));
    }
}
