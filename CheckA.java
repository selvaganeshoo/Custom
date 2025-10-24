public class CheckA{
	public static void main(String[] args){
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		System.out.println("Added 100 and 200: "+a);
		System.out.println("Remove 100 by value -> "+a.remove((Object) 100));
		System.out.println("Remove 200 by value -> "+a.remove((Object) 200));
		System.out.println("After remove: "+a);
		a.clear();
		a.add("cat");
		a.add(new String("dog"));
		System.out.println("Before remove strings: "+a);
		System.out.println("Remove cat literal ->" + a.remove("cat"));
		System.out.println("Remove new String(dog) -> "+a.remove(new String("dog")));
		System.out.println("After remove strings: "+ a);
		a.clear();
		a.add(50);
		a.add(60);
		System.out.println("Before remove int 50: "+ a);
		a.remove((Object) 50);
		System.out.println("After remove 50 using(Object) cast: "+a);
	}
}
