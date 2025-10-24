import java.util.Arrays;
import java.util.PriorityQueue;
public class Hello {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        Integer b[] = {56,65,10,9,2,6,5,0,33,45,23,67,17,11,1,3};
        PriorityQueue<Integer> c = new PriorityQueue<>(Arrays.asList(b));
        a.add(56);
        a.add(65);
        a.add(10);
        a.add(9);
        a.add(2);
        a.add(6);
        a.add(5);
        a.add(0);
        a.add(33);
        a.add(45);
        a.add(23);
        a.add(67);
        a.add(17);
        a.add(11);
        a.add(1);
        a.add(3);
        System.out.println(a);
        System.out.println(c);
    }
    

}
