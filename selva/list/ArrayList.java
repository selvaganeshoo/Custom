import java.util.Arrays;
public class ArrayList{
	private int index;
	private int capacity;
	private Object[] al;
	public ArrayList(){
		this.index = -1;
		this.capacity = 10;
		this.al = new Object[capacity];
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<=index;i++){
			sb.append(al[i]);
			if(i<index){
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	private void grow(){
		this.capacity+=10;
		al = Arrays.copyOf(al,capacity);
	}
	private void swifter(int ind,Object o){
		Object s1 = null;
		Object s1 = o;
		for(int i=ind;i<index+2;i++){
			s1 = al[i];
			al[i] = s2;
			s2 = s1;
		}
	}
	public boolean add(Object o){
	if(index+1 == capacity){
		grow();
	}
	al[++index] = o;
	return true;
	}
	public void add(int ind,Object o){
		if(index+1 < capacity){
			swifter(int ind,Object o);
		}
		}else if(index+1 == capacity){
			grow();
			swifter();
		}
	++index;
	}
}
