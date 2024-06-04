package DataStructuresReview.lesson5;

public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    public void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data); // output node data
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    public void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        preorderHelper(node.leftNode);
        System.out.printf("%s ", node.data); // output node data
        preorderHelper(node.rightNode);
    }

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    public void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
        System.out.printf("%s ", node.data); // output node data
    }
}
