import figures.Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println(rectangle.area());
    }
}
