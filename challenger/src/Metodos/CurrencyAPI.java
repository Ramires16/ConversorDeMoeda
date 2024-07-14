package Metodos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyAPI {

    public static double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        String urlStr = "https://v6.exchangerate-api.com/v6/c56b0137f93f6a545c522f14/latest/" + fromCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
        double exchangeRate = jsonObject.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
        return exchangeRate;
    }
}
