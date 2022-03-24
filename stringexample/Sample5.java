package stringexample;
//Check whether the given string is palindrome or not
public class Sample5 {
    public static void main(String[] args) {
        String str="aabbaa";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb.reverse());
        String sb1 = sb.toString();
        if(str.equals(sb1)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }
    }
}
