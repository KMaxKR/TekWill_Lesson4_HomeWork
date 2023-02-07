public class Main {
    public static void main(String[] args){
        TemperatureConverter temp = new TemperatureConverter();
        temp.toCelsius(20.4);
        temp.toFahrenheit(34.8);

        System.out.println(temp.getCelsius() + " grade Celsius este " + temp.getFahrenheitFromCelsius() + " F");
        System.out.println(temp.getFahrenheit() + " grade Fahrenheit este " + temp.getCelsiusFromFahrenheit() + " C");
    }
}
