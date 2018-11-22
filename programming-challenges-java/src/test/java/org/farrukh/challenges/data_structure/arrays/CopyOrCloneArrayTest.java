package org.farrukh.challenges.data_structure.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CopyOrCloneArrayTest {


    @Test
    public void test2() {
        ChildObjs[] children1 = {
                new ChildObjs("Ali"),
                new ChildObjs("Vali"),
                new ChildObjs("Sami"),
        };
        ParentObj[] parents = new ParentObj[3];
        for (int i = 0; i < parents.length; i++) {
            ParentObj parentObj = new ParentObj();
            parentObj.setChildren(children1);
            parents[i] = parentObj;


        }


        ParentObj[] copyParentObjs = Arrays.copyOf(parents, parents.length);

        ParentObj[] cloneParentObjs = parents.clone();


        System.out.println();


    }

    @Test
    public void test() {

        int[] anArray = new int[]{0, 1, 2, 3};

        System.out.println(anArray.getClass());

        int[] copyOfAnArray = Arrays.copyOf(anArray, anArray.length);

        int[] cloneOfTheAnArray = anArray.clone();

        Assert.assertNotEquals(anArray, copyOfAnArray);
        Assert.assertNotEquals(anArray, cloneOfTheAnArray);

        System.out.println(copyOfAnArray.getClass());
        System.out.println();

    }


    class ParentObj {

        private ChildObjs[] children;

        public ChildObjs[] getChildren() {
            return children;
        }

        public void setChildren(ChildObjs[] children) {
            this.children = children;
        }
    }

}
