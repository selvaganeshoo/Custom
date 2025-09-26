public class CheckA{
	public static void main(String[] args){
		ArrayList a = new ArrayList();
		a.add("hello");
		a.add("hi");
		a.add("Object");
		a.add("how");
		a.add("are");
		a.add("you");
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a.contains("you"));
		System.out.println(a.capacity());
		a.add("new");
		a.add("Object1");
		a.add(24);
		System.out.println(a.capacity());
		a.trimSize();
		System.out.println("capacity: "+a.capacity());
		System.out.println(a);
		System.out.println("index: "+a.size());
	}
}
