package ua.goit.for11module.squareFigure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShapeUtil {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void programBegin() {
        System.out.println("If you need to calculate the square of geometric figures,\n " +
                "please, choose type of geometric figure: Circle, Triangle, Rectangle or enter Out for exit: ");
    }
}
