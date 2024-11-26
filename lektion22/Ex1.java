import java.io.*;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;

public class Ex1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI wiki = URI.create("https://www.aftonbladet.se");
        HttpRequest request = HttpRequest.newBuilder().uri(wiki).build();

        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        // We find the actual web page in the body
        System.out.println(resp.body());
    }
}
