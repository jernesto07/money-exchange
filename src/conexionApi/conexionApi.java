package conexionApi;

import com.google.gson.*;
import desafioMoneyExchange.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class conexionApi {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("indique la moneda:");
        String moneda = teclado.nextLine();

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/ce7b9ecdf3d6e1131c4ab74c/latest/USD"))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body()  );

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        monedas miMoneda = gson.fromJson(json, monedas.class);
        System.out.println();







    }
}
