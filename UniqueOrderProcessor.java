import java.util.HashMap;
public class UniqueOrderProcessor{
    HashMap<String,String> orderId =new HashMap<>();

    private void add(String key,String value){
        if(orderId.containsKey(key))
        {
            throw new DuplicateOrderException();
        }else{
            orderId.put(key, value);
        }
    }
    public String toString(){
        return orderId.toString();
    }
    public static void main(String[] args) {
        UniqueOrderProcessor a = new UniqueOrderProcessor();
        a.add("1","A" );
        a.add("2", "l");
        a.add("3", "B");
        System.out.println(a);
        a.add("1", "h");
        System.out.println(a);
    }
}
 class DuplicateOrderException extends RuntimeException{
        DuplicateOrderException(){
            super("Invalid Track Exception");
        }
    }
