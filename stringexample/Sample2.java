package stringexample;

public class Sample2 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = new String("Java");
        System.out.println(str1.length());
        System.out.println(str1.concat(str2));
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(str4);
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.substring(2, 4));
        System.out.println(str1.isEmpty());
        System.out.println(str1.replace("Hello","Hy"));
        System.out.println(str4.indexOf('a'));
        System.out.println(str4.lastIndexOf('a'));
        System.out.println(str1.contains("Hello"));

    }
}
