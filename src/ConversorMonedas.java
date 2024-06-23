import com.google.gson.Gson;
import entities.MonedaDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMonedas {

    public MonedaDTO buscarMoneda(String denominacionBase) {
        String apiKey = "c7193e0e68f633d82f84f888"; // Coloca tu API key aquí
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + denominacionBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedaDTO.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("SE PRODUJO UN ERROR AL REALIZAR LA CONVERSIÓN");
        }
    }

    public double convertirMoneda(double cantidad, double tasaDeCambio) {
        return cantidad * tasaDeCambio;
    }
}
