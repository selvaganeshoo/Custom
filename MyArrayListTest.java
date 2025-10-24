public class MyArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println("=== Test 1: Adding integers ===");
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println("List after adding: " + list);

        System.out.println("\n=== Test 2: Removing by value ===");
        System.out.println("Remove 100 -> " + list.remove((Object) 100));
        System.out.println("Remove 200 -> " + list.remove((Object) 200));
        System.out.println("List now: " + list);

        System.out.println("\n=== Test 3: Removing by index ===");
        list.add(400);
        list.add(500);
        System.out.println("List before removing index 1: " + list);
        System.out.println("Removed element at index 1 -> " + list.remove(1));
        System.out.println("List now: " + list);

        System.out.println("\n=== Test 4: Adding Strings and new String objects ===");
        list.clear();
        list.add("cat");
        list.add(new String("dog"));
        list.add("bird");
        System.out.println("List: " + list);

        System.out.println("Remove \"cat\" -> " + list.remove("cat"));
        System.out.println("Remove new String(\"dog\") -> " + list.remove(new String("dog")));
        System.out.println("List now: " + list);

        System.out.println("\n=== Test 5: indexOf, lastIndexOf, contains ===");
        list.add("apple");
        list.add("banana");
        list.add("apple");
        System.out.println("List: " + list);
        System.out.println("indexOf(\"apple\") -> " + list.indexOf("apple"));
        System.out.println("lastIndexOf(\"apple\") -> " + list.lastIndexOf("apple"));
        System.out.println("contains(\"banana\") -> " + list.contains("banana"));
        System.out.println("contains(\"cherry\") -> " + list.contains("cherry"));

        System.out.println("\n=== Test 6: set, get, size, isEmpty ===");
        list.set(0, "kiwi");
        System.out.println("List after set index 0 -> kiwi: " + list);
        System.out.println("Get index 1 -> " + list.get(1));
        System.out.println("Size -> " + list.size());
        System.out.println("isEmpty -> " + list.isEmpty());

        System.out.println("\n=== Test 7: clear and trimSize ===");
        list.clear();
        System.out.println("List after clear: " + list);
        System.out.println("isEmpty -> " + list.isEmpty());
        list.add("x");
        list.add("y");
        list.add("z");
        System.out.println("List before trimSize: " + list);
        list.trimSize();
        System.out.println("List after trimSize: " + list);

        System.out.println("\n=== Test 8: Exception cases ===");
        try {
            list.get(-1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception on get(-1): " + e.getMessage());
        }

        try {
            list.get(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception on get(10): " + e.getMessage());
        }

        try {
            list.set(5, "oops");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception on set(5, \"oops\"): " + e.getMessage());
        }

        try {
            list.add(10, "fail");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception on add(10, \"fail\"): " + e.getMessage());
        }

        try {
            list.remove(20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception on remove(20): " + e.getMessage());
        }

        try {
            // ArrayList negative = new ArrayList(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception on new ArrayList(-5): " + e.getMessage());
        }
        System.out.println("\n=== Test Completed ===");
    }
}
