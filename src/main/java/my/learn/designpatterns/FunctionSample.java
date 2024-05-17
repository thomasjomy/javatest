package my.learn.designpatterns;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Meteo meteo = new Meteo(20);

        Function<Meteo, Integer> readCelsius = m -> m.getTemperature();
        Function<Integer, Double> celsiusToFahrenheit = t -> t * 9d / 5d + 32d;

        Function<Meteo, Double> readFahrenheitAndConvertToFahrenheit = readCelsius.andThen(celsiusToFahrenheit);
        System.out.println("Celsius to Fahrenheit : " + readFahrenheitAndConvertToFahrenheit.apply(meteo));

        Function<Meteo, Double> celsiusToFahrenheitComposed = celsiusToFahrenheit.compose(readCelsius);
        System.out.println("Celsius to Fahrenheit : " + celsiusToFahrenheitComposed.apply(meteo));



    }
}
