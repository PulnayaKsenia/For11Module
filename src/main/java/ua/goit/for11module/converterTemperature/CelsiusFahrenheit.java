package ua.goit.for11module.converterTemperature;

public class CelsiusFahrenheit extends Converter{
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public String getConverterType() {
        return "celsius";
    }

    @Override
    public double calculate() {
        return ((celsius * 9 / 5) + 32);
    }

    @Override
    public String getScale() {
        return "enter the Celsius temperature: ";
    }
}

