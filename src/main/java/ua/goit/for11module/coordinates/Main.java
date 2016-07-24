package ua.goit.for11module.coordinates;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Util pointXY = new Util();
        Point xy = pointXY.readConsole();

        double calculate = xy.calculate();
        System.out.println(calculate);
    }
}

