package recursion.Easy;

public class R5Triangle {
    //We have triangle made of blocks.
    // The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
    //triangle(0) → 0
    //triangle(1) → 1
    //triangle(2) → 3
    public static int triangle(int rows) {
        //Base Condition
        if(rows == 0){
            return 0;
        }
        //Recursive Function
        return rows + triangle(rows-1);
    }

    public static void main(String[] args) {
        System.out.println(triangle(5));
    }
}
