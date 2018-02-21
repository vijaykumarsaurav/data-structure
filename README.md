<h1>Data Structrue - LinkList operations</h1>
<h2>Singly Linked List</h2>
<p>=&gt; Add one by one. =&gt; addFirst() insert a element at first position. <br /> =&gt; addLast() insert a element at last position. <br /> =&gt; addPosition() insert a element at given position. <br /> =&gt; removeFirst() remove a element at first position. <br /> =&gt; removeLast() remove a element at last position. <br /> =&gt; removePosition() remove a element at given position. <br /> =&gt; show all the element of link list. <br /> </p>
<pre>     public static void main(String[] args) {
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
	</pre>
<p><br /> <strong>Output : </strong> </p>
<pre>   10      one     true    60.3    @       six 
   Mid data : true
	</pre>
<p><br /> Code : https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/LinkedListDemo.java</p>
<hr />
<h2>Doubly Linked List</h2>
<p>&nbsp;</p>
<pre>	public static void main(String[] args) {
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
		System.out.println("Forward Direction&gt;&gt;&gt;");
		list.showForward();
		System.out.println("Forward Direction&gt;&gt;&gt; before adding position ");
		list.addPosition(3, "Mid");
		System.out.println(" after adding");
		System.out.println("Forward Direction&gt;&gt;&gt;");
		list.showForward();
		System.out.println("\nBackward Direction&lt;&lt;&lt;");
		list.showBackward();
		System.out.println("\nEndend");
	}
	</pre>
<p><br /> <strong>Output : </strong> </p>
<pre>	Forward Direction&gt;&gt;&gt; 
	10	one	true	60.3	@	Forward Direction&gt;&gt;&gt; before adding position  
	 after adding 
	Forward Direction&gt;&gt;&gt; 
	10	one	Mid	true	60.3	@	
	Backward Direction&lt;&lt;&lt; <br />
	@	60.3	true	Mid	one	10	 
	Endend
	</pre>
<p><br /> Code :https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/DoblelyLinkedListDemo.java </p>
<hr />
<h2>Circular Linked List</h2>
<p>&nbsp;</p>
<pre>	public static void main(String[] args) {
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
	</pre>
<p><br /> <strong>Output : </strong> </p>
<pre>	Start 
	Most_First	First	10	one	byPosition	true	60.3	@	Last	Most_Last	  
	End 
	</pre>
<p>Code :https://github.com/vijaykumarsaurav/data-structure/blob/master/src/com/data/structure/CircularLinkedListDemo.java</p>
