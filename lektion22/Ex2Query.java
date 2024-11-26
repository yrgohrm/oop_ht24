import java.io.*;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.*;

public class Ex2Query {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI showerUri = URI.create("https://laromedel.nu/showerthought/?type=json");
        HttpRequest request = HttpRequest.newBuilder().uri(showerUri).build();

        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        System.out.println(resp.body());
    }
}
