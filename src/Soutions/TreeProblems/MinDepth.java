package Soutions.TreeProblems;

public class MinDepth {
    /*
    100% Solution
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int level=0;
        q.offer(root);

        while(!q.isEmpty()){
            level++;
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                TreeNode temp = q.poll();
                // It is a Leaf Node
                if(temp.left==null && temp.right==null)
                    return level;
                if(temp.left!=null)  q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
        }
        // مش هيوصل للتقطة دي ولكن عشان ال return type لا اكثر
        return 0;

    }
     */
}
