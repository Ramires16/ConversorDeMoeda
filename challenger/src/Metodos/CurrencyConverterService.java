package Metodos;

public class CurrencyConverterService {
    public double convert(String fromCurrency, String toCurrency, double amount) throws CurrencyConversionException {
        try {
            double exchangeRate = CurrencyAPI.getExchangeRate(fromCurrency, toCurrency);
            return amount * exchangeRate;
        } catch (Exception e) {
            throw new CurrencyConversionException("Erro ao buscar taxa de câmbio", e);
        }
    }
}
