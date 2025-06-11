package lab9.prog9_1;

public class MyStack {
	private MyStringLinkedList list;
	public MyStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		if(list.size() > 0) {
			String s = list.get(0);
			list.remove(0);
			return s;
		}
		return null;
	}

	public String peek() {
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	public void push(String s) {
		list.add(s);
	}

	public static void main(String[] args){
		MyStack stack = new MyStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
		System.out.println("Popping…"+stack.pop());
		System.out.println("Popping…"+stack.pop());
		System.out.println("Popping…"+stack.pop());
	}
}
