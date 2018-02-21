   <h1> Data Structrue - LinkList operations </h1>
    <h2> Singly Linked List </h2>
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



   <hr>
    <h2>Doubly Linked List  </h2>
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
<b>Output : </b>	
Forward Direction>>>
10	one	true	60.3	@	Forward Direction>>> before adding position 
 after adding
Forward Direction>>>
10	one	Mid	true	60.3	@	
Backward Direction<<<
@	60.3	true	Mid	one	10	
Endend

Code :https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/DoblelyLinkedListDemo.java



 <hr>
    <h2>Circular Linked List  </h2>
	public static void main(String[] args) {

        System.out.println("Start");
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add("one");
        list.add(true);
        list.add(60.30);
        list.add('@');
      //list.add("Last");
        list.addFirst("First");
        list.addFirst("Most_First");
        list.addLast("Last");
        list.addLast("Most_Last");
        list.addPosition(5,"byPosition");
        list.show();
        System.out.println("\nEnd");
    }
<b>Output : </b>	
Start
Most_First	First	10	one	byPosition	true	60.3	@	Last	Most_Last	
End
Code :https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/CircularLinkedListDemo.java