package recursion.Easy;

public class R4BunnyEar2 {
    //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    //bunnyEars2(0) → 0
    //bunnyEars2(1) → 2
    //bunnyEars2(2) → 5
    public static int bunnyEars2(int bunnies) {
        //Base condition
        if(bunnies == 0){
            return 0;
        }
        //Recursive Function
        if(bunnies%2 == 0){//For even numbers.
            return 3 + bunnyEars2(bunnies-1);
        }
        //For odd numbers.
        return 2 + bunnyEars2(bunnies-1);
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars2(9));
    }
}
