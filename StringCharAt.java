public class StringCharAt {
    public static void main(String[] args) {
        String sentence = "I live in Dhaka";
        //char c = sentence.charAt(0);
        char c = sentence.charAt(sentence.length()-3);
        System.out.println(c);
        int index = sentence.indexOf("i");
        System.out.println(index);
    }
}
