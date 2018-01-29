    # data-struecture
     Data Structrue - LinkList operations :
      => Add one by one.
      => addFirst is for add as first element.
      => addLast is for add as last element.
      => addPosition add in given position.
      => show all the element of link list.

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

    Output :
    LinkedList
    before_start	start	10	20	somevalue	one	true	60.3	V	K	midvalue	last	lastonemore

    Code : https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/LinkedListDemo.java