import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Custom1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, MyString> map = new HashMap<>();
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Key: ");
            String keyStr = sc.nextLine();
            System.out.print("Enter Value: ");
            String valueStr = sc.nextLine();

            String key = keyStr;
            MyString value = new MyString(valueStr);
            if(map.containsKey(key)){
                System.out.println("Duplicate not added");
                --i;
            }else{
                map.put(key, value);
            }
        }
        System.out.println();
        System.out.println("Output:");
        List<MyString> valuesList = new ArrayList<>();
        for (Map.Entry<String, MyString> entry : map.entrySet()) {
            String key = entry.getKey();
            MyString value = entry.getValue();
            valuesList.add((MyString) value);
            System.out.println(key + " - " + value + " : key.equals(value)? " + key.equals(value));
            System.out.println("value.equals(value)? " + value.equals(value));
        }
        System.out.println();
        System.out.println("Comparing different value objects:");
        for (int i = 0; i < valuesList.size(); i++) {
            for (int j = i + 1; j < valuesList.size(); j++) {
                System.out.println(valuesList.get(i) + ".equals " + valuesList.get(j) + " " +valuesList.get(i).equals(valuesList.get(j)));
            }
        }
        sc.close();
    }
}
class MyString {
    String str;
    MyString(String s) {
        this.str = s;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyString)) return false;
        MyString other = (MyString) o;
        return this.str.equals(other.str);
    }
    @Override
    public String toString() {
        return str;
    }
}