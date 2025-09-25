import java.util.Arrays;
import java.util.EmptyStackException;
public class Stack{
	private int capacity;
	private int index;
	private Object[] stack;
	public Stack(){
	this.capacity = 10;
	this.index = -1;
	this.stack = new Object[capacity];
	}
	public int capacity(){
		return capacity;
	}
	public boolean empty(){
		if(index == -1){
			return true;
		}
		else{
			return false;
		}
	}
	public int search(Object o){
		for(int i=index;i>=0;i--){
			if(stack[i] == o){
				return (index-i)+1;
			}
		}
		return -1;
	}
	private void grow(){
		index+=10;
		stack = Arrays.copyOf(stack,capacity);
	}
	public void push(Object o){
		if(index+1 == capacity){
			grow();
		}
		stack[++index] = o;
	}
	public Object pop(){
		if(index >= 0){
			Object p = stack[index];
			index--;
			return p;
		}else{
			throw new EmptyStackException();
		}
	}
	public Object peek(){
		if(index >= 0){
			return stack[index];
		}else{
			throw new EmptyStackException();
		}
	}
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= index; i++) {
            sb.append(stack[i]);
            if (i < index) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
