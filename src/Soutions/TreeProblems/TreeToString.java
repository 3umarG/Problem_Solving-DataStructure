package Soutions.TreeProblems;

public class TreeToString {
    /*
    Iterative Solution ....
    public String tree2str(TreeNode root) {
        if(root==null){
            return "";
        }
        StringBuilder s = new StringBuilder();
        Stack<TreeNode> st = new Stack<>();
        Set<TreeNode> visited  =new HashSet<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur = st.peek();
            // First Option : Visited Node
            if(visited.contains(cur)){
                st.pop();
                s.append(")");
            }else{
                // Add the Node to visited set ...
                visited.add(cur);
                s.append("("+cur.val);

                // Special Case : Not have left , but have right
                if(cur.left==null && cur.right!=null){
                    s.append("()");
                }
                if(cur.right!=null){
                    st.push(cur.right);
                }
                if(cur.left!=null){
                    st.push(cur.left);
                }
            }
        }
        return s.substring(1,s.length()-1).toString();

    }
     */


    /*
    Recursive Solution ....

    public String tree2str(TreeNode root) {
        // First Case
        if(root==null){
            return "";
        }

        // Second Case
        if(root.left==null && root.right==null){
            return root.val+"";
        }


        // Third Case : Can be Deleted
        if(root.left==null){
            // Ex : 2()(3)
            return root.val + "()(" + tree2str(root.right) + ")";
        }

        if(root.right==null){
            return root.val+"("+tree2str(root.left)+")";
        }

        // Final Case : Every Left & Right have value
        return root.val+"("+tree2str(root.left)+")("+tree2str(root.right)+")";



    }
     */
}
