package com.btinordertraversal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class SolutionTest {
    TreeNode instantiateNodes(String test){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode duplicateFive = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        HashMap<Integer, TreeNode> map = new HashMap<>(Map.of(
                1, one,
                2, two,
                3, three,
                4, four,
                5, five,
                55, duplicateFive,
                6, six,
                7, seven,
                8, eight,
                9, nine
        ));
        if (Objects.equals(test, "null")) {
            return null;
        } else if (Objects.equals(test, "full tree")) {
            TreeNode root = new TreeNode(map.get(1).val, map.get(2), map.get(3));
            //[1,2,3,4,5,null,8,null,null,6,7,9]

            map.get(2).left = map.get(4);
            map.get(2).right = map.get(5);

            map.get(3).right = map.get(8);

            map.get(5).left = map.get(6);
            map.get(5).right = map.get(7);

            map.get(8).left = map.get(9);

            map.get(3).left = null;
            map.get(4).left = null;
            map.get(4).right = null;
            map.get(6).left = null;
            map.get(6).right = null;
            map.get(7).left = null;
            map.get(7).right = null;
            map.get(8).right = null;
            map.get(9).left = null;

            return root;
        } else if (Objects.equals(test, "duplicate")) {
        TreeNode root = new TreeNode(map.get(1).val, map.get(2), map.get(3));
        //[1,2,3,4,5,5,8,null,null,6,7,9]

        map.get(2).left = map.get(4);
        map.get(2).right = map.get(5);

        map.get(3).left = map.get(55);
        map.get(3).right = map.get(8);

        map.get(5).left = map.get(6);
        map.get(5).right = map.get(7);

        map.get(8).left = map.get(9);

        map.get(4).left = null;
        map.get(4).right = null;
        map.get(6).left = null;
        map.get(6).right = null;
        map.get(7).left = null;
        map.get(7).right = null;
        map.get(8).right = null;
        map.get(9).left = null;

        return root;
    } else {
            throw new Error("case not yet created");
        }
    }


    @DisplayName("null node")
    @Test
    void nullNode()
    {
        TreeNode n = instantiateNodes("null");
        List<Integer> actualList = Solution.inorderTraversal(n);
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, actualList);
    }
    //input: [1,2,3,4,5,null,8,null,null,6,7,9]
    //expected output: [4,2,6,5,7,1,3,9,8]
    @DisplayName("tree")
    @Test
    void tree()
    {
        TreeNode n = instantiateNodes("full tree");
        List<Integer> actualList = Solution.inorderTraversal(n);
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, actualList);
    }
    //input: [1,2,3,4,5,5,8,null,null,6,7,9]
    //expected output: [4,2,6,5,7,1,5,3,9,8]
    @DisplayName("tree with duplicate values")
    @Test
    void duplicate()
    {
        int[] actual = null;
        TreeNode n = instantiateNodes("duplicate");
        List<Integer> actualList = Solution.inorderTraversal(n);
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, actualList);
    }
}