package com.data.structure;


/**
 * Created by Vijay Kumar on 29-Jan-18.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
      //  System.out.println("LinkedList");
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add("one");
        list.add(true);
        list.add(60.30);
        list.add('V');
        list.show();
    }
}


class LinkedList{
    Node head,temp;
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
    public void show(){
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

}

class Node{
    Object data;
    Node next;
    public Node(Object o){
        this.data = o;
    }
 }