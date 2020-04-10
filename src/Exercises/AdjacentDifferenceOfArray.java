package Exercises;

public class AdjacentDifferenceOfArray {
    public static void main(String[] args) {
        int MyArray [] = {1,5,8,3,9,7,5,1,8,1,9};
        System.out.println(DifferenceCalculator(MyArray));



    }
    public static int DifferenceCalculator (int Array [] ){
        int difference = 0;
        int maxDifference = 0;

        for (int i = 0; i<Array.length-1; i++){
            difference = Math.abs(Array [i] - Array [i+1]);
            if (difference>maxDifference){
                maxDifference = difference;
            }
        }
        return maxDifference;
    }

}
