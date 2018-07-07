package org.farrukh.challenges.structures.strings;

import static java.lang.System.out;

public class StringBasicOperations {

    public static void main(String[] args) {

        String str  = "Hello world!";
        out.printf("str: %s\n", str);

        int lengthOfStr = str.length();
        out.printf("lengthOfStr: %d\n", lengthOfStr);

        char charAtOfStr_0 = str.charAt(0);
        out.printf("charAtOfStr_0: %c\n", charAtOfStr_0);

        int codePointAt_0 = str.codePointAt(0);
        out.printf("codePointAt_0: %d\n", codePointAt_0);

        String concatStrToMy = str.concat("My");
        out.printf("concatStrToMy: %s\n", concatStrToMy);

        byte[] bytesOfStr = str.getBytes();
        out.print("bytesOfStr: ");
        for (byte b :bytesOfStr){
            out.printf("%02x", b);
        }
        out.println();

        String substringOfStr_0_5 = str.substring(0, 5);
        out.printf("substringOfStr_0_5: %s\n", substringOfStr_0_5);

        CharSequence subSequenceOfStr_0_5 = str.subSequence(0, 5);
        out.printf("subSequenceOfStr_0_5: %s\n", subSequenceOfStr_0_5);


    }

}
