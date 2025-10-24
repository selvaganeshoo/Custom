import java.util.Arrays;
import java.util.EmptyStackException;

public class Customstack {
    private int maxsize = 10;
    private int DEFAULT_CAPACITY = 5;
    private Object stack[];
    private int size;
    Customstack(){
        size = 0;
        stack = new Object[DEFAULT_CAPACITY];
    }
    public boolean push(Object a){
        if(size==maxsize){
            throw new StackOverFlowCustomException();
        }else if(size<0){
            throw new EmptyStackException();
        }else if(size == DEFAULT_CAPACITY){
            DEFAULT_CAPACITY+=5;
            stack = Arrays.copyOf(stack,DEFAULT_CAPACITY);
        }
        stack[size++] = a;
        return true;
    }
    public Object peek(){
        if(isEmpty()){
            return -1;
        }else{
            return stack[this.size-1];
        }
    }
    public boolean isEmpty(){
        if(size==0||size<0){
            return true;
        }
        return false;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }else{
            stack[--size] = null;
        }
    }
    public String toString(){
        StringBuilder a = new StringBuilder();
        a.append("[");
        for(int i=0;i<size;i++){
            a.append(stack[i]);
            if(i!=size-1){a.append(",");}
        }
        a.append("]");
        return a.toString();
    }
    public static void main(String[] args) {
        Customstack g = new Customstack();
        g.push(1);
        g.push(6);
        g.push(7);
        g.push(8);
        g.push(9);
        g.push(2);
        System.out.println(g.peek());
        g.push(3);
        g.push(4);
        g.push(5);
        g.push(10);
        System.out.println(g);
        g.push(5);
        g.push(10);
    }
}
class StackOverFlowCustomException extends StackOverflowError{
        StackOverFlowCustomException(){
            super();
        }
}
