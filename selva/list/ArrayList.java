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
	public ArrayList(int capacity){
		if(capacity<0){
			throw new IllegalArgumentException("Should be positive number");
		}
		this. capacity = capacity;
		this.index = -1;
		this.al = new Object[capacity];
	}
	public int capacity(){
		return this.capacity;
	}
	public int size(){
		return this.index+1;
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<size();i++){
			sb.append(al[i]);
			if(i<size()-1){
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	private String outOfBound(int ind){
		return "Index: "+ ind + " size: " + size();
	}
	private void grow(){
		this.capacity+=10;
		al = Arrays.copyOf(al,capacity);
	}
	private void swifter(int ind){
		for(int i = index;i>=ind;i--){
			al[i+1] = al[i];
		}
	}
	private void swapper(int ind){
		for(int i=ind;i<index;i++){
			al[i] = al[i+1];
		}
	}
	public boolean add(Object o){
	if(size() == capacity){
		grow();
	}
	al[++index] = o;
	return true;
	}
	public Object remove(int ind){
		if(ind<0||ind > index){
			throw new ArrayIndexOutOfBoundsException(this.outOfBound(ind));
		}
		Object removed = al[ind];
		swapper(ind);
		al[index--] = null;
		return removed;
	}
	public boolean remove(Object o){
		for(int i=0;i<=index;i++){
			if(o==null ? al[i] == null : o.equals(al[i])){
				remove(i);
				return true;
			}
		}
		return false;
	}
	public void add(int ind,Object o){
		if(size() == capacity){
			grow();
		}
		if(ind >= size()||ind<0){
			throw new ArrayIndexOutOfBoundsException(this.outOfBound(ind));
		}
		swifter(ind);
		++index;
		al[ind] = o;
	}
	public Object set(int ind,Object o){
		if(ind>index||ind<0){
			throw new ArrayIndexOutOfBoundsException(this.outOfBound(ind));
		}
		al[ind] = o;
		return o;
	}
	public void clear(){
		for(int i=0;i<=index;i++){
			al[i] = null;
		}
		index = -1;
	}
	public boolean isEmpty(){
		return this.index==-1;
	}
	public Object get(int ind){
		if(ind>index||ind<0){
			throw new ArrayIndexOutOfBoundsException(this.outOfBound(ind));
		}
		return al[ind];
	}
	public int indexOf(Object o){
		for(int i=0;i<=index;i++){
			if(o==null ? al[i] == null : o.equals(al[i])){
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(Object o){
		for(int i=index;i>=0;i--){
			if(o==null ? al[i] == null : o.equals(al[i])){
				return i;
			}
		}
		return -1;
	}
	public boolean contains(Object o){
		return indexOf(o)>=0;
	}
	public void trimSize(){
		this.capacity = size();
		al = Arrays.copyOf(al,capacity);
	}
}

