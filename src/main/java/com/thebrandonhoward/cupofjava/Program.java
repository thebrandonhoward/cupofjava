package com.thebrandonhoward.cupofjava;

import java.util.*;

class Program {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    /*
                                        1
                               2                 3
                            4     5           6     7
                         8      9   10
                      11               12







     */
    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> sumList = new ArrayList<>();

        if(Objects.isNull(root))
            return sumList;

        Stack<BinaryTree> dfsStack = new Stack<>();
        dfsStack.add(root);

        int branchValueSummation = 0;

        while(!dfsStack.isEmpty()) {
            BinaryTree currentNode = dfsStack.pop();

            boolean isLeafNode = Objects.isNull(currentNode.left) && Objects.isNull(currentNode.right);
            boolean hasLeft = Objects.nonNull(currentNode.left);
            boolean hasRight = Objects.nonNull(currentNode.right);

            if(isLeafNode)
                sumList.add(branchValueSummation + currentNode.value);

            if(Objects.nonNull(currentNode.right))
                dfsStack.push(root.right);

            if(Objects.nonNull(root.left))
                dfsStack.push(root.left);

        }

        return sumList;
    }
}
