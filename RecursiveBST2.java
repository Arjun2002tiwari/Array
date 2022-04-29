class Node{
    int data;
    Node left,right;
    
    Node(int data){  //here we create the nodes of tree.
        this.data=data;
        left=right=null;
    }
}
public class RecursiveBST2 {

    Node root;
    RecursiveBST2(){
        root=null;//here we define the root of tree.
    }
    void insert(int data){
        root=insertD(root,data);//here we call 
        //the recursive function for insertion.
    }
    Node insertD(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){//here we traverse into the tree to leaf node.
                root.left=insertD(root.left, data);
                //here we call the func. again.
        }
        else if(data>root.data){
                root.right=insertD(root.right, data);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){//here we traverse in Left,ROOT,RIGHT manner.
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        RecursiveBST2 obj=new RecursiveBST2();
        obj.insert(50); 
        obj.insert(30); 
        obj.insert(20); 
        obj.insert(40); 
        obj.insert(70); 
        obj.insert(60); 
        obj.insert(80);
        obj.inorder(obj.root);
        
    }
}
