package stringexample;

public class Sample1 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        String str1 = String.format("She said %s", str);
        System.out.println(str1);
        String str3 = str.substring(2, 3);
        System.out.println(str3);

    }
}
