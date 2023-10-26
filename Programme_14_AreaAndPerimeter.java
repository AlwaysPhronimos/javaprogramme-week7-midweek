package homework_midweek_7;

import java.util.Scanner;

/**
 * Write a Java programme to print the area perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) 28.20
 */
public class Programme_14_AreaAndPerimeter {
    // Calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(double height, double width) {
        double perimeter = 2 * (height + width);
        double area = (height * width);
        System.out.println("Area is " + height + " * " + width + " = " +area);
        System.out.println("Perimeter is" + " " + "2 * (" + height + " * " + width + ") = "  +perimeter);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double width = scanner.nextDouble();
        areaAndPerimeterOfRectangle(height, width);
        //closing the scanner object
        scanner.close();
    }
}
