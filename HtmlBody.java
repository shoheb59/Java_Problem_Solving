public class HtmlBody {
    public static void main(String[] args) {
        String a = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        System.out.println(a);
        System.out.println("Extracted id is: " +a.substring(a.indexOf("TXN123456")));
    }
}
