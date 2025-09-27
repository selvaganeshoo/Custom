import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	private int capacity;
	private int index;
	private Object[] stack;

	public Stack() {
		this.capacity = 10;
		this.index = -1;
		this.stack = new Object[capacity];
	}
	public int size(){
		return index+1;
	}
	public int capacity() {
		return capacity;
	}

	public boolean empty() {
		return index == -1;
	}

	public int search(Object o) {
		for (int i = size()-1; i >= 0; i--) {
			if (stack[i]!=null && o.equals(stack[i])){
				return ((size()-1) - i) +1;
			}
			else if (o==null &&stack[i]==null) {
				return ((size()-1) - i) + 1;
			}
		}
		return -1;
	}

	private void grow() {
		capacity += 10;
		stack = Arrays.copyOf(stack, capacity);
	}

	public void push(Object o) {
		if (size() == capacity) {
			grow();
		}
		stack[++index] = o;
	}

	public Object pop() {
		if (index >= 0) {
			Object p = stack[index];
			stack[index] = null;
			index--;
			return p;
		} else {
			throw new EmptyStackException();
		}
	}

	public Object peek() {
		if (index >= 0) {
			return stack[index];
		} else {
			throw new EmptyStackException();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i <= index; i++) {
			sb.append(stack[i]);
			if (i < index)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}
