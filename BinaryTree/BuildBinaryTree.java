package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);

            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public static void preorder(Node root) { // O(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {// O(n)
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
            ;
        }

        public static void levelorder(Node root) {

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }

                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int heightOfTree(Node root){
            if(root == null){
                return 0;
            }
            
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int totNumNodes(Node root){
            if(root ==  null){
                return 0;
            }
            
            int leftCount = totNumNodes(root.left);
            int rightCount = totNumNodes(root.right);

            return leftCount + rightCount + 1;
        }

        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return root.data + leftSum + rightSum;
        }
    }

    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelorder(root);
        // int treeHeight = tree.heightOfTree(root);
        // System.out.println(treeHeight);
        // int totNodeCount = tree.totNumNodes(root);
        // System.out.println(totNodeCount);
        int sumOfNodes = tree.sumOfNodes(root);
        System.out.println(sumOfNodes);
    }

}
