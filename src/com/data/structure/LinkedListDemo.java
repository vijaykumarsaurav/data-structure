/**
 * Created by Vijay Kumar Saurav on 29-Jan-18.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add("one");
        list.add(true);
        list.add(60.30);
        list.add('@');
	list.add("six");
        list.addFirst("start");
        list.addLast("last");
        list.addPosition("midvalue",5);
        list.removeFirst();
        list.removeLast();
        list.removePosition(4);
	list.show();
	list.showMid();
       
    }
}

class LinkedList{
    Node head=null,temp=null;
    public void add(Object o){
        if(head ==  null){
            head = new Node(o);
        }else{
            temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(o);
        }
    }
    public boolean addPosition(Object o, int num){
        if(num <= 0){
            return false;
        }else if(num == 1){
            addFirst(o);
        }else{
            temp = head;
            Node temp2;
            int counter=1;
            while (temp.next != null){
                if(counter == num-1){
                    temp2 = temp.next;
                    temp.next = new Node(o);
                    temp = temp.next;
                    temp.next = temp2;
                    return true;
                }
                temp = temp.next;
                counter++;
            }
            if(num >= counter){
                addLast(o);
            }
        }
        return false;
    }
    public boolean addFirst(Object o){
        Node newNode = new Node(o);
        newNode.next = head;
        head = newNode;
        return true;
    }
    public boolean addLast(Object o){
        Node newNode = new Node(o);
        temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return true;
    }

    public boolean removeFirst(){
        head = head.next;
        return true;
    }
    public boolean removeLast(){
        temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return true;
    }

    public void show(){
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }
   public void showMid(){
	Node rabbit, torr;
	rabbit = torr = head;
	while(rabbit.next != null && rabbit.next.next != null){
		rabbit = rabbit.next.next;
		torr = torr.next;
	}
	System.out.print("\nMid data : " + torr.data + "\t");
    }
    public boolean removePosition(int num){
        if(num <= 0){
            return false;
        }else if(num == 1){
            removeFirst();
        }else{
            temp = head;
            Node temp2;
            int counter=1;
            while (temp.next != null){
                if(counter == num-1){
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
                counter++;
            }
            if(num == counter){
                removeLast();
            }
        }
        return false;
    }

}

class Node{
    Object data;
    Node next;
    public Node(Object o){
        this.data = o;
    }
 }
