
class node{
    int data;
    node next;
    node(int _data){
        data = _data;
        next = null;
        //System.out.print(data+" -> ");
    }
}
class LinkedList{
    node head = null;
    node tail = null;
    public void addnode(int _data){
        node newnode = new node(_data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void insertatfirst(int _data){
        node newnode = new node(_data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        
            }
            public void printlist(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data +" -> ");
                temp = temp.next;
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
       LinkedList num = new LinkedList();
       num.addnode(5);
       num.addnode(10);
       num.insertatfirst(2);
       num.printlist();
	}
}

output : 2 -> 5 -> 10 ->
