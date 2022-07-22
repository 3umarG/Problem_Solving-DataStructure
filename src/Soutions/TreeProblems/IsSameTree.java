package Soutions.TreeProblems;

import java.util.*;

public class IsSameTree {
    /*
    My Solution : Spagetty Code :(
    class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q!=null || p!=null && q==null) return false;
        // First Tree ...
     Stack<TreeNode> s1 = new Stack<>();
     Stack<TreeNode> s2 = new Stack<>();

        while((p!=null && q!=null) || (!s1.isEmpty() && !s2.isEmpty())){
            if(p!=null && q!=null){
                    if(p.val != q.val) return false;
            }
            if(p==null && q!=null || p!=null && q==null) return false;
            while(p!=null && q!=null){
                s1.push(p);
                s2.push(q);
                p=p.left;
                q=q.left;
                if(p!=null && q!=null){
                    if(p.val != q.val) return false;
                }
                if(p==null && q!=null || p!=null && q==null) return false;
             }
            p=s1.pop();
            q=s2.pop();
            if(p.val != q.val) return false;
            p=p.right;
            q=q.right;
            if(p!=null && q!=null){
                    if(p.val != q.val) return false;
            }
            if(p==null && q!=null || p!=null && q==null) return false;

        }
        return true;
    }
}
     */
    /*
    Recursion Solution ...

     */
    public static void main(String[] args) {
//        Queue<Integer> q =new LinkedList<>();
//        q.offer(0);
//        q.poll();
//        q.size();
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(1);
        System.out.println(Integer.parseInt(Collections.max(s).toString()));
    }
}
