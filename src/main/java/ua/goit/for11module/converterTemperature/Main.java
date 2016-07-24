package ua.goit.for11module.converterTemperature;

import static ua.goit.for11module.converterTemperature.Util.READER;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Util.programBegin();
        String[] split;

        try {
            String temperature = Util.READER.readLine();
            Enum.Temperature enumTemper = Enum.Temperature.valueOf(temperature);

            switch (enumTemper) {
                case Celsius:
                    CelsiusFahrenheit celsiusFahrenheit = new CelsiusFahrenheit();
                    split = readParams(celsiusFahrenheit);

                    Double celsius = Double.parseDouble(split[0]);

                    celsiusFahrenheit.setCelsius(celsius);
                    double cels = celsiusFahrenheit.calculate();

                    System.out.println(cels);
                    break;

                case Fahrenheit:
                    FahrenheitCelsius fahrenheitCelsius = new FahrenheitCelsius();
                    split = readParams(fahrenheitCelsius);

                    Double fahrenheit = Double.parseDouble(split[0]);

                    fahrenheitCelsius.setFahrenheit(fahrenheit);
                    double fahr = fahrenheitCelsius.calculate();

                    System.out.println(fahr);
                    break;

                case Out:
                    System.exit(1);
            }

        }catch (Exception ex) {
            System.out.println("You enter wrong value!");
        }
    }

    private static String[] readParams(Converter converter) throws IOException {
        System.out.println(converter);
        String inputForConverter = READER.readLine();

        return inputForConverter.split(",");
    }
}
