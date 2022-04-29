class Node{
    int data;
    Node next;
}
public class RotateLinkedList {

    Node head;
    RotateLinkedList(){
        head=null;
    }
    void insert(int data){

        Node n1=new Node();
        n1.data=data;
        n1.next=null;
        if(head==null){
            head=n1;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=n1;
        }
    }
    void rotate(){
        Node prevlast=null;
        Node last=head;
        while(last.next!=null){
            prevlast=last;
            last=last.next;
        }
        last.next=head;
        head=last;
        prevlast.next=null;
    }
    void travesre(){
        Node current;
        for(current=head;current!=null;current=current.next){
            System.out.println(current.data);
        }
    }
    public static void main(String[] args) {
        RotateLinkedList obj=new RotateLinkedList();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.rotate();
        obj.travesre();

    }
}
