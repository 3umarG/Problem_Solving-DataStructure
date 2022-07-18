package Soutions.TreeProblems;

public class PostOrderTraversal {
    /*
    Recursive Solution .....
    class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        post(root,list);
        return list;
    }

    public void post(TreeNode root , List list){
        if(root!=null){
            post(root.left,list);
            post(root.right,list);
            list.add(root.val);
        }

    }
}
     */


    /*
    Iterative Solution .....
    class Solution {
    public List postorderTraversal(TreeNode root) {
        List list = new LinkedList<>();
        if(root == null)
            return list;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode cur = stack.peek();
            if( cur.left ==null && cur.right == null)
                list.add(stack.pop().val);
            if(cur.left != null)
            {
                stack.push(cur.left);
                cur.left = null;
            }
			// else is needed becuase otherwise the right child will be on the top of the stack
            else if(cur.right != null)
            {
                stack.push(cur.right);
                cur.right = null;
            }

        }
        return list;
    }
}
     */
}
