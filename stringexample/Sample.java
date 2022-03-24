package stringexample;

public class Sample {


    public static void main(String[] args) {
        String var1="Sunday";
        String var2="Funny Jokes";

        StringBuilder sb = new StringBuilder();
        String extractedWord = var2.substring(0,5);
        System.out.println(extractedWord);

        String finalWord = var1.replace("Sun", extractedWord);
        System.out.println(finalWord);

    }

}
