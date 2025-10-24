import java.util.LinkedList;

public class Playlist {
    LinkedList<String> a = new LinkedList<>();
    public String playAt(int index){
        if(index<0||index>a.size()){
            throw new InvalidTrackException();
        }
        else{
            return a.get(index);
        }
    }
    public void add(String s){
        a.add(s);
    }
    public String toString(){
        return a.toString();
    }
    public static void main(String[] args) {
        Playlist a =new Playlist();
        a.add("hello");
        a.add("song");
        a.add("null");
        System.out.println(a);
        System.out.println(a.playAt(0));
        System.out.println(a.playAt(1));
        System.out.println(a.playAt(3));
    }
    class InvalidTrackException extends RuntimeException{
        InvalidTrackException(){
            super("Invalid Track Exception");
        }
    }
}
