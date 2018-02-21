/**
 * Created by Vijay Kumar Saurav on 29-Jan-18.
 */
public class DoblelyLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(10);
        list.add("one");
        list.add(true);
        list.add(60.30);
        list.add('@');
		//list.addFirst("First");
		//list.addFirst("FirstMost");
		//list.addLast("Last");
		//list.addLast("LastMost");
		System.out.println("Forward Direction>>>");
		list.showForward();
		System.out.println("Forward Direction>>> before adding position ");
		list.addPosition(3, "Mid");
		System.out.println(" after adding");
		System.out.println("Forward Direction>>>");
		list.showForward();
		System.out.println("\nBackward Direction<<<");
		list.showBackward();
		System.out.println("\nEndend");
    }
}

class DoubleLinkedList{
    Node head,tail,temp,temp2;
    
    public void showForward(){
        temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "\t");
			temp = temp.next;
		}
    }
	
    public void showBackward(){
        temp = tail;
        while (temp!= null) {
            System.out.print(temp.data + "\t");
			temp = temp.previous;
		}
    }
	
	public void add(Object o){
        if(head ==  null){
           head = tail = new Node(o);
		   head.previous = null;
        }else{
			temp=new Node(o);
			tail.next=temp;
			temp.previous=tail;
			tail = temp;
        }
    }
	public void addFirst(Object o){
		temp = new Node(o);
		temp.next = head;
		head.previous = temp;
		head = temp;
	}
	
	public void addLast(Object o){
		temp = new Node(o);
		tail.next = temp;
		temp.previous = tail;
		tail = temp;
	}
	
	public void addPosition(int num, Object o){
		Node n = new Node(o);
		temp = head;
		for(int i=1; i < num-1; i++){
			temp = temp.next;
		}
		
		
		 /* n.next = temp.next;
		temp.next=n;
		n.previous = temp; 
		temp.next.previous=n;  */
		  temp2 = temp.next;
		temp.next=n;
		n.previous=temp;
		n.next=temp2;
		temp2.previous=n; 
		
		
	}
	
	
}

class Node{
    Object data;
    Node next,previous;
    public Node(Object o){
        this.data = o;
    }
 }