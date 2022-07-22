package Soutions.TreeProblems;

import javax.swing.tree.TreeNode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MaxDepth {
    /*
    Recursion Solution :
     public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else{
            return 1+Math.max(maxDepth(root.left) , maxDepth(root.right));
        }
    }
     */

    /*
    Iterative Solution :

     */
    public static void main(String[] args) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
    }
}
