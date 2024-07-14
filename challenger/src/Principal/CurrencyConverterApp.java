package Principal;

import Metodos.CurrencyConversionException;
import Metodos.CurrencyConverterService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {

        CurrencyConverterService converterService = new CurrencyConverterService();
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> currencyOptions = new HashMap<>();

        // Adicionando as opções de moeda com seus nomes completos
        currencyOptions.put(1, "EUR - Euro");
        currencyOptions.put(2, "GBP - British Pound");
        currencyOptions.put(3, "JPY - Japanese Yen");
        currencyOptions.put(4, "AUD - Australian Dollar");
        currencyOptions.put(5, "CAD - Canadian Dollar");
        currencyOptions.put(6, "CHF - Swiss Franc");
        currencyOptions.put(7, "BRL - Brazilian Real");

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        System.out.println("""
                Digite a moeda de origem, moedas disponíveis para conversão: 
                EUR - Euro 
                GBP - British Pound
                JPY - Japanese Yen
                AUD - Australian Dollar
                CAD - Canadian Dollar
                CHF - Swiss Franc
                BRL - Brazilian Real
                    DIGITE APENAS AS SIGLAS
                        """);
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Escolha a moeda de destino:");
        for (Map.Entry<Integer, String> entry : currencyOptions.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        int choice = scanner.nextInt();
        String toCurrency = "";

        switch (choice) {
            case 1:
                toCurrency = "EUR";
                break;
            case 2:
                toCurrency = "GBP";
                break;
            case 3:
                toCurrency = "JPY";
                break;
            case 4:
                toCurrency = "AUD";
                break;
            case 5:
                toCurrency = "CAD";
                break;
            case 6:
                toCurrency = "CHF";
                break;
            case 7:
                toCurrency = "BRL";
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.println("Digite o valor a ser convertido: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = converterService.convert(fromCurrency, toCurrency, amount);
            System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        } catch (CurrencyConversionException e) {
            System.err.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}