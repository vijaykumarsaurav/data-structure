/**
 * Created by Vijay Kumar Saurav on 29-Jan-18.
 */
public class CircularLinkedListDemo {
    public static void main(String[] args) {

        System.out.println("Start");
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add("one");
        list.add(true);
        list.add(60.30);
        list.add('@');
      //  list.add("Last");
        list.addFirst("First");
        list.addFirst("Most_First");
        list.addLast("Last");
        list.addLast("Most_Last");
        list.addPosition(5,"byPosition");
        list.show();
        System.out.println("\nEnd");
    }
}

class CircularLinkedList{
    Node head,temp;
    public void add(Object o){
        if(head ==  null){
            head = new Node(o);
            head.next=head;
        }else{
            temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = new Node(o);
            temp = temp.next;
            temp.next = head;
        }
    }

    public void addFirst(Object o){
        temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        Node newNode = new Node(o);
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addLast(Object o){
        temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        Node newNode = new Node(o);
        temp.next = newNode;
        newNode.next = head;
    }
    public void addPosition(int num, Object o){
        if(num == 1){
            addFirst(o);
            return;
        }
        temp = head;
       /*

       for (int i=1; i<num-1; i++){
            temp = temp.next;
        }
        Node temp2 = temp.next;
        Node newNode = new Node(o);
        temp.next = newNode;
        newNode.next = temp2;
        */

        int counter=1;
        while (temp.next != head) {
            if (counter == num - 1) {
                break;
            }
            temp = temp.next;
            counter++;
        }

        Node temp2 = temp.next;
        Node newNode = new Node(o);
        temp.next = newNode;
        newNode.next = temp2;

    }
    public void show(){
        temp = head;
        do {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }while (temp != head);
    }


    class Node{
        Object data;
        Node next;
        public Node(Object o){
            this.data = o;
        }
    }

}
