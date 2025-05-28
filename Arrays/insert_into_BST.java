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
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // Iterative approach

        if(root==null) return new TreeNode(val);//checking for if root exist? if not then push a new node into tree

        TreeNode curr=root;//creating a new node to traverse on tree

        while(true)//loop for traversing tree till any condition breakss after insertion,it runns till any new is inserted
        {
            if(curr.val<val)//checking on root 
            {
                
            if(curr.right!=null) //checking for roots right
                curr=curr.right;
            else { //insertion 
                curr.right=new TreeNode(val);
                 break;
            }
           
            }
            else { //if lesser than root 
                if(curr.left!=null)//left of root
                 curr=curr.left;
                else{ //insertion
                 curr.left=new TreeNode(val);

                break;
                }
            }
        }
        return root;



        //Recursive approach

        if(root==null)
        return new TreeNode(val);

        if(root.val > val)
        root.left=insertIntoBST(root.left,val);
        
        else
         root.right=insertIntoBST(root.right,val);

         return root;
    }
}
