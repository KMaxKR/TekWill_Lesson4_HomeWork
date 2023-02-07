public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

    public double getCelsius(){
        return celsius;
    }
    public double getFahrenheit(){
        return fahrenheit;
    }
    public void toCelsius(double MyCelsius){
        this.celsius = MyCelsius;
    }
    public void toFahrenheit(double MyFahrenheit){
        this.fahrenheit = MyFahrenheit;
    }
    public double getCelsiusFromFahrenheit(){
        return (double) (5 * (fahrenheit - 32) / 9);
    }
    public double getFahrenheitFromCelsius(){
        return (double) (9 * celsius * (32 * 5) / 5);
    }
}