public class CurrencyConverter {
    private double exchangeRateRUB = 0.38; // курс BYN/RUB
    private double exchangeRateUSD = 2.50; // курс BYN/USD
    private double exchangeRateEUR = 2.20; // курс BYN/EUR
    private double exchangeRateUAH = 9.00; // курс BYN/UAH


    public double convert(double amount, String toCurrency) {
        double convertedAmount = 0.0;


        switch (toCurrency) {
            case "RUB":
                convertedAmount = amount * exchangeRateRUB;
                break;
            case "USD":
                convertedAmount = amount / exchangeRateUSD;
                break;
            case "EUR":
                convertedAmount = amount / exchangeRateEUR;
                break;
            case "UAH":
                convertedAmount = amount * exchangeRateUAH;
                break;
            default:
                System.out.println("Unsupported currency: " + toCurrency);
                break;
        }


        return convertedAmount;
    }
}

class three {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();


        double amountBYN = 100.0;


        double amountRUB = converter.convert(amountBYN, "RUB");
        System.out.println(amountBYN + " BYN = " + amountRUB + " RUB");


        double amountUSD = converter.convert(amountBYN, "USD");
        System.out.println(amountBYN + " BYN = " + amountUSD + " USD");


        double amountEUR = converter.convert(amountBYN, "EUR");
        System.out.println(amountBYN + " BYN = " + amountEUR + " EUR");


        double amountUAH = converter.convert(amountBYN, "UAH");
        System.out.println(amountBYN + " BYN = " + amountUAH + " UAH");
    }
}




