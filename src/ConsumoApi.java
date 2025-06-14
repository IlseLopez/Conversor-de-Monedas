
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConsumoApi {

    public Monedas convertirMonedas(String base_code) {
        String url = "https://v6.exchangerate-api.com/v6/d754dc32780759f503853384/latest/" + base_code;

        URI direccion = URI.create(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertir JSON a objeto Java
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Monedas monedas = gson.fromJson(response.body(), Monedas.class);

            return monedas;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
