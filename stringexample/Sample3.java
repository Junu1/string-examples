package stringexample;

public class Sample3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(2, "Hy");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(1, 4);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
