class node{
    int data ;
    node next ;
    node(int _data){ //initial the data and node
        data = _data;
        next = null;
        System.out.print(_data+" -> ");
    }
}
class linkedlist{
    node head = null;
    node tail = null;
    public void addnode(int _data){
        node newnode = new node(_data);//passing to initial the value and address
        if(head == null){ //if ther is no node head is null and tail also null ,then it is new node ->it is head and it is tail also
            head = newnode;
            tail = newnode;
        }
        else{ // if node is not null the current node next store the newnode address 
            tail.next = newnode;
            tail = newnode;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    linkedlist list = new linkedlist();
	    list.addnode(10);
	    list.addnode(20);
	}
}
//10 -> 20
