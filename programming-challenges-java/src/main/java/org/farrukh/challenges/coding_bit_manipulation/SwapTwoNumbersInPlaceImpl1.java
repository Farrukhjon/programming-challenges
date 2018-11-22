package org.farrukh.challenges.coding_bit_manipulation;

import static java.lang.System.out;

public class SwapTwoNumbersInPlaceImpl1 {

    public static void main(String[] args) {
        Integer x = 11;
        Integer y = 10;
        x = x + y;
        y = x - y;
        x = x - y;

        out.println("A:" + x);
        out.println("B:" + y);
    }

}
