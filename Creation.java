import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Creation {
    public static void main(String[] args) throws IOException {
        File b = new File("Example.java");
        b.createNewFile();
        try{
            BufferedWriter c = new BufferedWriter(new FileWriter("Example.java"));
            c.write("public class Example {\n" +
"    public static void main(String[] args) {\n" +
"        System.out.println(\"Starting Example.java program...\");\n" +
"        for (int i = 0; i < 100; i++) {\n" +
"            System.out.println(\"Loop iteration: \" + i);\n" +
"        }\n" +
"        Example ex = new Example();\n" +
"        ex.generateNumbers(50);\n" +
"        ex.processStrings();\n" +
"        ex.calculateFibonacci(20);\n" +
"        ex.printPattern(10);\n" +
"        ex.demoDataStructures();\n" +
"        System.out.println(\"Example.java program finished.\");\n" +
"    }\n" +
"    public void generateNumbers(int n) {\n" +
"        System.out.println(\"Generating numbers up to \" + n);\n" +
"        for (int i = 1; i <= n; i++) { System.out.print(i + \" \"); }\n" +
"        System.out.println();\n" +
"    }\n" +
"    public void processStrings() {\n" +
"        String[] words = {\"Java\",\"Example\",\"BufferedWriter\",\"File\",\"Code\",\"Hello\"};\n" +
"        for (String word : words) { System.out.println(word + \" -> \" + word.toLowerCase() + \" -> \" + word.toUpperCase()); }\n" +
"    }\n" +
"    public void calculateFibonacci(int n) {\n" +
"        long a = 0, b = 1;\n" +
"        for (int i = 0; i < n; i++) {\n" +
"            System.out.print(a + \" \");\n" +
"            long c = a + b; a = b; b = c;\n" +
"        }\n" +
"        System.out.println();\n" +
"    }\n" +
"    public void printPattern(int n) {\n" +
"        for (int i = 1; i <= n; i++) {\n" +
"            for (int j = 1; j <= i; j++) { System.out.print(\"*\"); }\n" +
"            System.out.println();\n" +
"        }\n" +
"    }\n" +
"    public void demoDataStructures() {\n" +
"        int[] numbers = new int[50];\n" +
"        for (int i = 0; i < numbers.length; i++) numbers[i] = i * 2;\n" +
"        for (int num : numbers) System.out.print(num + \" \");\n" +
"        System.out.println();\n" +
"    }\n" +
"    public void repeatedMethod1() { for(int i=0;i<100;i++){System.out.println(\"RM1 \" + i);}}\n" +
"    public void repeatedMethod2() { for(int i=0;i<100;i++){System.out.println(\"RM2 \" + i);}}\n" +
"    public void repeatedMethod3() { for(int i=0;i<100;i++){System.out.println(\"RM3 \" + i);}}\n" +
"    public void repeatedMethod4() { for(int i=0;i<100;i++){System.out.println(\"RM4 \" + i);}}\n" +
"    public void repeatedMethod5() { for(int i=0;i<100;i++){System.out.println(\"RM5 \" + i);}}\n" +
"    public void repeatedMethod6() { for(int i=0;i<100;i++){System.out.println(\"RM6 \" + i);}}\n" +
"    public void repeatedMethod7() { for(int i=0;i<100;i++){System.out.println(\"RM7 \" + i);}}\n" +
"    public void repeatedMethod8() { for(int i=0;i<100;i++){System.out.println(\"RM8 \" + i);}}\n" +
"    public void repeatedMethod9() { for(int i=0;i<100;i++){System.out.println(\"RM9 \" + i);}}\n" +
"    public void repeatedMethod10() { for(int i=0;i<100;i++){System.out.println(\"RM10 \" + i);}}\n" +
"}");
            c.close();
            System.out.println("Writtern Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
