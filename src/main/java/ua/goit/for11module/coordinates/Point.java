package ua.goit.for11module.coordinates;

public abstract class Point {
    public abstract String getPoint();
    public abstract String getCoordinates();
    public abstract double calculate();

    @Override
    public String toString() {
        return "Please, enter initial params (coma is delimiter) for " + getPoint() + " with next coordinates: " +
                getCoordinates();
    }
}
