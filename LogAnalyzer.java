import java.util.HashMap;
public class LogAnalyzer{
    HashMap<String,Integer> a =new HashMap<>();
    public void add(String s){
      if(s.equals("ERROR")||s.equals("INFO")||s.equals("DEBUG")){
        
        a.put(s, a.getOrDefault(s,0 )+1);
        
    }
    }
    public String toString(){
      return a.toString();
    }
  public static void main(String[] args) {
    LogAnalyzer b = new LogAnalyzer();
    b.add("ERROR");
    b.add("ERROR");
    b.add("ERROR");
    b.add("INFO");
    b.add("DEBUG");
    b.add("INFO");
    b.add("DEBUG");
    b.add("INFO");
    b.add("DEBUG");
    b.add("ERROR");
    b.add("ERROR");
    b.add("ERROR");
    b.add("INFO");
    b.add("DEBUG");
    b.add("INFO");
    b.add("DEBUG");
    b.add("INFO");
    b.add("DEBUG");
     b.add("INFO");
    b.add("DEBUG");
    System.out.println(b);
  }
}