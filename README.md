    # data-struecture
     Data Structrue - LinkList operations :
      => Add one by one.
      => addFirst() insert a element at first position.
      => addLast() insert a element  at last position.
      => addPosition() insert a element at given position.
      => removeFirst() remove a element at first position.
      => removeLast() remove a element at last position.
      => removePosition() remove a element at given position
      => show all the element of link list.

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

   <b>Output : </b>

   10      one     true    60.3    @       six <br>
   Mid data : true

   Code : https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/LinkedListDemo.java
