package org.farrukh.challenges.data_structure.strings;

public class UniquenessSolution1 implements Uniqueness {


    @Override
    public boolean isUniqueCharacters(String str) {
        int test = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = (int) str.charAt(i) - 'a';
            if ((test & (1 << val)) > 0) {
                return false;
            }
            test |= (1 << val);
        }
        return true;
    }

}
