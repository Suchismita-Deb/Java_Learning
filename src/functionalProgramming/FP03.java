package functionalProgramming;

import java.util.List;

public class FP03 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(12,13,14,15,16);
        System.out.println("Printing Even Number in the List.");
        ll.stream()
                .filter(FP03::checkEvenNumber)
                .forEach(System.out::println);
        // In the filter when we cannot able to get the individual element work then we can make a static function.
        // Here we are not calling the method like isEven().
        // We are just saying that these are the methods to be called and if it return true then move to the next line.
    }
    public static boolean checkEvenNumber(int num){
        return num%2==0;
    }
}
