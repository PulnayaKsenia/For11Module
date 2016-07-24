package ua.goit.for11module.converterTemperature;

public class FahrenheitCelsius extends Converter{
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public String getConverterType() {
        return "fahrenheit";
    }

    @Override
    public String getScale() {
        return "enter the Fahrenheit temperature: ";
    }

    @Override
    public double calculate() {
        return ((fahrenheit - 32) * 5 / 9);
    }
}

