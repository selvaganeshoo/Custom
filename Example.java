public class Example {
    public static void main(String[] args) {
        System.out.println("Starting Example.java program...");
        for (int i = 0; i < 100; i++) {
            System.out.println("Loop iteration: " + i);
        }
        Example ex = new Example();
        ex.generateNumbers(50);
        ex.processStrings();
        ex.calculateFibonacci(20);
        ex.printPattern(10);
        ex.demoDataStructures();
        System.out.println("Example.java program finished.");
    }
    public void generateNumbers(int n) {
        System.out.println("Generating numbers up to " + n);
        for (int i = 1; i <= n; i++) { System.out.print(i + " "); }
        System.out.println();
    }
    public void processStrings() {
        String[] words = {"Java","Example","BufferedWriter","File","Code","Hello"};
        for (String word : words) { System.out.println(word + " -> " + word.toLowerCase() + " -> " + word.toUpperCase()); }
    }
    public void calculateFibonacci(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long c = a + b; a = b; b = c;
        }
        System.out.println();
    }
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { System.out.print("*"); }
            System.out.println();
        }
    }
    public void demoDataStructures() {
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) numbers[i] = i * 2;
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();
    }
    public void repeatedMethod1() { for(int i=0;i<100;i++){System.out.println("RM1 " + i);}}
    public void repeatedMethod2() { for(int i=0;i<100;i++){System.out.println("RM2 " + i);}}
    public void repeatedMethod3() { for(int i=0;i<100;i++){System.out.println("RM3 " + i);}}
    public void repeatedMethod4() { for(int i=0;i<100;i++){System.out.println("RM4 " + i);}}
    public void repeatedMethod5() { for(int i=0;i<100;i++){System.out.println("RM5 " + i);}}
    public void repeatedMethod6() { for(int i=0;i<100;i++){System.out.println("RM6 " + i);}}
    public void repeatedMethod7() { for(int i=0;i<100;i++){System.out.println("RM7 " + i);}}
    public void repeatedMethod8() { for(int i=0;i<100;i++){System.out.println("RM8 " + i);}}
    public void repeatedMethod9() { for(int i=0;i<100;i++){System.out.println("RM9 " + i);}}
    public void repeatedMethod10() { for(int i=0;i<100;i++){System.out.println("RM10 " + i);}}
}