import java.util.Arrays;
public class ArrayList{
	private int index;
	private int capacity;
	private Object[] al;
	public ArrayList(){
		this.index = -1;
		this.capacity = 0;
		this.al = new Object[capacity];
	}
	public ArrayList(int capacity){
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
		for(int i=0;i<=index;i++){
			sb.append(al[i]);
			if(i<index){
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	private String outOfBound(int ind){
		return "Index: "+ ind + " size: " + index;
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
	if(index+1 == capacity){
		grow();
	}
	al[++index] = o;
	return true;
	}
	public Object remove(int ind){
		Object var1 = al[ind];
		swapper(ind);
		--index;
		return var1;
	}
	public boolean remove(Object o){
		for(int i=0;i<=index;i++){
			if(al[i] == o){
				swapper(i);
				--index;
				return true;
			}
		}
		return false;
	}
	public void add(int ind,Object o){
		if(index+1 == capacity){
			grow();
			swifter(ind);
			++index;
			al[ind] = o;
		}
		else if(ind >= index+2||ind<0){
			throw new ArrayIndexOutOfBoundsException(this.outOfBound(ind));
		}else if(index+1 < capacity) {
			swifter(ind);
			++index;
			al[ind] = o;
		}
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
			if(al[i] == o){
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(Object o){
		for(int i=index;i>=0;i--){
			if(al[i] == o){
				return i;
			}
		}
		return -1;
	}
	public boolean contains(Object o){
		return indexOf(o)>=0;
	}
	public void trimSize(){
		this.capacity = index+1;
		al = Arrays.copyOf(al,capacity);
	}
}

