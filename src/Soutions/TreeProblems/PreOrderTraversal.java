package Soutions.TreeProblems;

public class PreOrderTraversal {
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
    Recursive Solution ....
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            pre(root,list);
            return list;
        }

        public void pre(TreeNode root  , List list){
            if(root==null){
                return;
            }
            // Pre-Order : Root --> Left --> Right
            list.add(root.val);
            pre(root.left,list);
            pre(root.right,list);
        }

    }
     */

    /*
    Iterative Solution ....
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> l = new LinkedList<Integer>();
            Stack<TreeNode> s = new Stack<>();
            while(root!=null || !s.isEmpty()){
                while(root!=null){
                    s.push(root);
                    l.add(root.val);
                    root=root.left;
                }
                root = s.pop();
                root=root.right;
            }
            return l;
        }
    }
     */

}
