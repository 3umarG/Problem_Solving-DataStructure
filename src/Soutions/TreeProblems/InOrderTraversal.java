package Soutions.TreeProblems;

public class InOrderTraversal {
    /*

    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    /*
    // Recursive Solution
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            inOrder(root,list);
            return list;
        }

        public void inOrder(TreeNode root , List<Integer> list){
            if(root==null){
                return;
            }
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }
     */


    /*

    Iterative Solution ...
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list= new LinkedList<>();
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }

            root= st.pop();
            list.add(root.val);
            root=root.right;
        }
        return list;

     */
}
