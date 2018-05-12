import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Service {
    public static String performRequest(String urlAddress) throws IOException {
        String result ="";
        try {
            URL url = new URL(urlAddress);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String temp = "";
                for (; (temp = br.readLine()) != null;) {
                    result+=temp;
                    result+=System.lineSeparator()
;                }
            }
        } catch (IOException e) {
            throw e;
        }
        return result;
    }
}
