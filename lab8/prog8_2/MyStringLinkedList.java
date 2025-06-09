package lab8.prog8_2;

public class MyStringLinkedList {
	Node header;
	int size = 0;
	MyStringLinkedList(){
		header = new Node(null);
	}
	//adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		//place new node after header and 
		//establish links from new node to 
		//surrounding nodes
		n.next = header.next;
		n.previous = header;
		
		//establish links from surrounding 
		//nodes to the new node
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		size++;
	}
	
	//adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		//find last node
		Node last = header;
		while(last.next != null) {
			last = last.next;
		}
		//now last.next == null
        last.next = n;
        n.previous = last;
		size++;
	}
	
	//removes node in last position
	public void removeLast( ) {
		//if list is empty, return
		if(header.next == null) return;
		
		Node current = header;
		//traverse the list until current.next is 
		//null - then remove current
		while(current.next != null) {
			current = current.next;
		}
		//now current.next == null, so remove current
		Node previous = current.previous; 
		//previous is not null since current is not header
		previous.next = null;
		current.previous = null;
		size--;
	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	public boolean remove(String data) {
		Node current = header.next;
		while (current != null) {
			if (current.value != null && current.value.equals(data)) {
				if (current.previous != null) {
					current.previous.next = current.next;
				}
				if (current.next != null) {
					current.next.previous = current.previous;
				}
				size--;
				return true;
			}
			current = current.next;
		}
		return false;
	}


	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while(next != null && !next.value.equals(s)) {
			next = next.next;
		}
		//either next == null or next.value is s
		if(next == null) return false;
		else {//next.value.equals(s) 
			return true;
		}
	}
	// inserts a new Node containing data so that its
	// position in the list is now pos
	public void insert(String data, int pos) {
		Node n = new Node(data);
		if(pos < 0 || pos >= data.length()) return;
		else if(pos == 0) {
			addFirst(data);
		}
		else if (pos == size - 1) {
			addLast(data);
		}
		else {
			int cnt = 0;
			Node next = header.next;
			while(next != null) {
				if (cnt == pos) {
					Node newNode = new Node(data);

					next.previous.next = newNode;
					newNode.previous = next.previous;

					newNode.next = next;
					next.previous = newNode;
					size++;
					break;
				}
				next = next.next;
				cnt++;
			}
		}
	}
	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(String value){
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	private Node minNode(Node start) {
		if (start == null) return null;
		Node min = start;
		Node current = start.next;
		while (current != null) {
			if (current.value.compareTo(min.value) < 0) {
				min = current;
			}
			current = current.next;
		}
		return min;
	}

	private void swap(Node n1, Node n2) {
		if (n1 == null || n2 == null || n1 == n2) return;
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	public void minSort() {
		Node current = header.next;
		while (current != null) {
			Node min = minNode(current);
			System.out.println("min: " + min.value);
			swap(current, min);
			current = current.next;
		}
	}

	public static void main(String[] args){
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");

		System.out.println(list);
		list.insert("Abdelhadi", 0);
		list.insert("Omar", 3);
		System.out.println(list);
		list.insert("Steve", 3);
		System.out.println(list);

		String[] testArr = {
				"big", "small", "tall", "short", "round", "square",
				"enormous", "tiny", "gargantuan", "lilliputian",
				"numberless", "none", "vast", "miniscule"
		};

		var list2 = new MyStringLinkedList();
		for (String s : testArr) list2.addLast(s);

		list2.minSort();
		list.minSort();
		System.out.println("Sorted List:");
		System.out.println(list2);
		System.out.println(list);
	}
}
