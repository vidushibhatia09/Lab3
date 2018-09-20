public class WebScraper {


    public static void main(String[] args) {

        public class Mkmkmain {
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


    }





    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        System.out.println(urlToString("abc"));
        return contents;
    }
}
