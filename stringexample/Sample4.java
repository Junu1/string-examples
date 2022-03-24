package stringexample;

public class Sample4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome");
        System.out.println(sb.substring(1,5));
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));
        System.out.println(sb.capacity());
        System.out.println(sb.delete(2,4));

    }
}
