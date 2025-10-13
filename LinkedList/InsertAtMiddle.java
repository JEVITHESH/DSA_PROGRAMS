
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
    public void insertatend(int _data){
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
            public void printlist(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data +" -> ");
                temp = temp.next;
        }
    }
    public void insertatmid(int _data,int pos){
        node newnode = new node(_data);
        if(pos <= 0 ){
            System.out.print("invalid position");
            return;
        }
        if(pos==1){
            insertatfirst(_data);
            return;
        }
        int count =1;
        node temp = head;
        while(temp != null && count < pos-1){
            temp = temp.next;
            count++;
        }
        if(temp == null){
            insertatend(_data);
        }
        else{
            newnode.next = temp.next;
            temp.next = newnode;   
             if (newnode.next == null) { // If inserted at last
                tail = newnode;}
    }

    
}}
public class Main
{
	public static void main(String[] args) {
       LinkedList num = new LinkedList();
       num.addnode(5);
       num.addnode(10);
       num.insertatfirst(2);
       num.insertatend(15);
       num.insertatmid(3,2);
       num.printlist();
	}
}
//output : 2 -> 5 -> 10 -> 15 ->
