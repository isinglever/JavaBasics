import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String[] str = str1.split(" ");
//        String a = "Hello";
//        String b = "Hello";
//        long k = 8888888888
//        ;
//        System.out.println(a.equals(b));
//        float a = 0.6333;
        String a[];
    }
    
    public static boolean method(char[] s1,char[] s2){
        int[] dic = new int[128];
        for (int i = 0; i < s1.length; i++) {
            dic[s1[i]]++;
        }
        for (int i = 0; i < s2.length; i++) {
            dic[s2[i]]--;
            if (dic[s2[i]] < 0) {
                return false;
            }
        }
        return true;
    }
    
    class Person {
        static {
            System.out.println(name);
        }
        private static String name = "hello";
    }
}