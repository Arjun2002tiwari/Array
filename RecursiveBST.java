class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class RecursiveBST {
    Node root;

    RecursiveBST() {
        root = null;
    }

    void insert(int data) {
        root=insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if(data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        /* return the (unchanged) node pointer */
        return root;

    }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    Node deleteRec(Node root,int data){
        
        if(root==null){
            return root;
        }
        else if(data<root.data){
            root.left=deleteRec(root.left, data);
        }
        else if(data>root.data){
            root.right=deleteRec(root.right, data);
        }
        //case:if node has 0 child or 1 child.
        else{
            if(root.left == null){ 
                return root.right;
            } 
            else if(root.right == null){ 
                return root.left;
            }
            //Here we delete node having two children.
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root){ 
            int minv = root.data; 
            while (root.left != null) 
            { 
            minv = root.left.data; 
            root = root.left; 
            } 
            return minv; 
    }
    void delete(int data){
        root=deleteRec(root, data);
    }
     public static void main(String[] args) {
        RecursiveBST tree=new RecursiveBST();
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        //tree.inorder(tree.root);
        tree.delete(50);
        tree.inorder(tree.root);
    }
}
