package org.example.recursion.Easy;

public class R2BunnyEar {
    //We have a number of bunnies and each bunny has two big floppy ears.
    //We want to compute the total number of ears across all the bunnies.
    //bunnyEars(0) → 0
    //bunnyEars(1) → 2
    //bunnyEars(2) → 4

    public static int bunnyEars(int bunnies) {
        //base condition
        if(bunnies == 0){
            return 0;
        }
        return 2+bunnyEars(bunnies-1);
        //When we have to multiply then we can use addition in recursion.
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars(8));
    }
}
