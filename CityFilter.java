import java.util.HashSet;
public class CityFilter<T>{
    HashSet<T> s = new HashSet<>();
    public void add(T a){
        if(a==null){
            return;
        }
        if(a.equals("_____")){
            throw new EmptyLineException();
        }else if(s.contains(a)){
            System.out.println("duplicate avoided");
        }else{
            s.add(a);
        }
    }
    public String toString(){
        return s.toString();
    }
    public static void main(String[] args) {
        CityFilter<String> a = new CityFilter<>();
        a.add("hi");
        a.add(null);
        a.add("Same");
        a.add("Hello");
        System.out.println(a);
        a.add("_____");
    }
}
class EmptyLineException extends RuntimeException{
    EmptyLineException(){
        super();
    }
}