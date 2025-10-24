import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Queue;
// import java.util.Deque;
// import java.util.PriorityQueue;
// import java.util.ArrayDeque;
public class Check{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean condition = true;
	Stack a = new Stack();
	ArrayList<Object> arr = new ArrayList<>();
	arr.trimToSize();
while(condition){
	System.out.println("_____STACK_A_____");
	System.out.println("Enter 1 for Push Operation");
	System.out.println("Enter 2 for Pop Operation");
	System.out.println("Enter 3 for Peek Operation");
	System.out.println("Enter 4 for Search operation");
	System.out.println("Enter 5 for Check Stack Operation");
	System.out.println("Enter 6 to Check Capacity of Stack");
	System.out.println("Enter 7 to Display Elements in Stack");
	System.out.println("Enter 8 to End Stack Operation");
	System.out.println("_____STACK_A_____");
	int c = sc.nextInt();
	switch(c){
	case 1:
		System.out.print("Enter the element to be pushed: ");
		Object b = sc.nextInt();
		a.push(b);
		System.out.println("Element "+ b +" is pushed");
		break;
	case 2:
		System.out.print("Press Enter to pop the top element: ");
		Object h = sc.nextLine();
		System.out.println("Popped Element is: "+a.pop());
		break;
	case 3:
		System.out.print("Press Enter to show the top element: ");
		Object d = sc.nextLine();
		System.out.println("Element "+a.peek()+" is top element");
		break;
	case 4:
		System.out.print("Enter the Element to be searched: ");
		Object e = sc.nextInt();
		System.out.println("Your Search Element is "+ a.search(e)+" position");
		break;
	case 5:
		System.out.print("Press Enter to check the stack is empty or not: ");
		Object f = sc.nextLine();
		System.out.println(a.empty());
		break;
	case 6:
		System.out.print("Press Enter to check the capacity of stack: ");
		Object g = sc.nextLine();
		System.out.println("Capacity of stack is "+a.capacity());
		break;
	case 7:
		System.out.println("Elements of Stack");
		System.out.println(a);
		break;
	case 8:
		System.out.println("Stack Operation is ended");
		condition = false;
		break;
	default:
		System.out.println("Enter valid input");
	}
	}
	sc.close();
	}
}
