public class ExchangeRate {
    static void converter(byte option, double amount){
        String baseCode = "";
        String targetCode = "";
        System.out.print("Usted ha seleccionado: ");
        if (option == 1){
            baseCode = "USD";
            targetCode = "ARS";
            System.out.println("Dólar =>> Peso Argentino");
        }
        if (option == 2){
            baseCode = "ARS";
            targetCode = "USD";
            System.out.println("Peso Argentino =>> Dólar");
        }
        if (option == 3){
            baseCode = "USD";
            targetCode = "BRL";
            System.out.println("Dólar =>> Real Brasileño");
        }
        if (option == 4){
            baseCode = "BRL";
            targetCode = "USD";
            System.out.println("Real Brasileño =>> Dólar");
        }
        if (option == 5){
            baseCode = "USD";
            targetCode = "COP";
            System.out.println("Dólar =>> Peso Colombiano");
        }
        if (option == 6){
            baseCode = "COP";
            targetCode = "USD";
            System.out.println("Peso Colombiano =>> Dólar");
        }
        final String exchangeRateApiUrl = "https://v6.exchangerate-api.com/v6/320d5aa5f267e00642002111/pair/" + baseCode + "/" + targetCode + "/" + amount;
        System.out.println("==================================================");
        System.out.println("El valor xx.x [" + baseCode + "] corresponde al valor final de =>>> xx.x ["  + targetCode + "]");
        System.out.println("==================================================");
    }
}
/* Example requests:
https://v6.exchangerate-api.com/v6/320d5aa5f267e00642002111/latest/USD
https://v6.exchangerate-api.com/v6/320d5aa5f267e00642002111/pair/USD/COP
https://v6.exchangerate-api.com/v6/320d5aa5f267e00642002111/pair/USD/COP/100.0
*/