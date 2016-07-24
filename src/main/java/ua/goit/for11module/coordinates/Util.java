package ua.goit.for11module.coordinates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public Point readConsole() throws IOException {
        System.out.println("If you need to count coordinate between point x and y,\n" +
                "please, enter Point or Out for exit: ");

        String xy = READER.readLine();
        String[] split;
        Enum.Coordinate enumCoordinate = Enum.Coordinate.valueOf(xy);

        switch (enumCoordinate) {
            case Point:
                CoordinatesXY coordinatesXY = new CoordinatesXY();
                split = readParams(coordinatesXY);

                try {
                    coordinatesXY.setX1(Double.parseDouble(split[0]));
                    coordinatesXY.setX2(Double.parseDouble(split[1]));
                    coordinatesXY.setY1(Double.parseDouble(split[2]));
                    coordinatesXY.setY2(Double.parseDouble(split[3]));

                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                }
                return coordinatesXY;

            case Out:
                System.exit(1);

            default:
                readConsole();
        }
        return null;
    }

    private String[] readParams(Point point) throws IOException {
        System.out.println(point);
        String inputForPoint = READER.readLine();

        return inputForPoint.split(",");
    }
}
