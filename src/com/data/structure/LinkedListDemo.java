package com.data.structure;


/**
 * Created by Vijay Kumar on 29-Jan-18.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("LinkedList");
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add("one");
        list.add(true);
        list.add(60.30);
        list.add('V');
        list.add('K');
        list.addFirst("start");
        list.addFirst("before_start");
        list.addLast("last");
        list.addLast("lastonemore");
        list.addPosition("midvalue",10);
        list.addPosition("somevalue",5);
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