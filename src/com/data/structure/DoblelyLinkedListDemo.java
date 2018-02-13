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
		list.add("six");
		list.show();
		list.showBackward();
		System.out.println("\nEndend");
    }
}

class DoubleLinkedList{
    Node head,tail,temp;
    
    public void show(){
        temp = head;
        while (temp!= tail) {
            System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.print(temp.data + "\t");
    }
	
	
    public void showBackward(){
        temp = tail;
        while (temp!= head) {
            System.out.print(temp.data + "\t");
			temp = temp.previous;
		}
	//	System.out.print(temp.data + "\t");
    }
	
	public void add(Object o){
        if(head ==  null){
           head = tail = new Node(o);
        }else{
            temp = head;
            while (temp != tail){
                temp = temp.next;
            }
            temp.next = new Node(o);
			temp.previous = temp;
			tail = temp.next;
        }
    }
   

}

class Node{
    Object data;
    Node next,previous;
    public Node(Object o){
        this.data = o;
    }
 }