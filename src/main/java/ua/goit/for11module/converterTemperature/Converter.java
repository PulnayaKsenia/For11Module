package ua.goit.for11module.converterTemperature;

public abstract class Converter {
    public abstract String getConverterType();
    public abstract String getScale();
    public abstract double calculate();

    @Override
    public String toString() {
        return "Please, enter initial params for " + getConverterType() + " with next params: "
                + getScale();
    }
}
