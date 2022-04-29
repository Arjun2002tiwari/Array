class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = n;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = n;
                        return;
                    }
                }
            }
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void delete_o_child(int data){
        Node current=root;
        Node parent;
        while(true){
            parent=current;
            if(data<current.data){
                current=current.left;
                if(current.data==data){
                    parent.left=null;
                    return;
                }
            }
            else{
                current=current.right;
                if(current.data==data){
                    parent.right=null;
                    return;
                }
            }
        }
    }
    void delete_1_child(int data){
        Node current=root;
        Node parent;
        Node prevparent=null;
        while(true){
            parent=current;
        }
    }

    public static void main(String[] args) {
        BST obj=new BST();
        obj.insert(8);
        obj.insert(6);
        obj.insert(4);
        obj.insert(7);
        obj.insert(15);
        obj.insert(17);
        obj.inorder(obj.root);
        System.out.println();
        obj.preorder(obj.root);
        System.out.println();
        //System.out.println(obj.root.right.data);
        obj.delete_o_child(17);
        obj.inorder(obj.root);
        
        
    }
}
