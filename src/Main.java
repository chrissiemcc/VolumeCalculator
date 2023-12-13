import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final double pi = Math.PI;
    static Scanner myObj = new Scanner(System.in);
    static boolean correctInput;

    public static void main(String[] args) {
        int input = -1;

        while(input != 0){
            input = -1; //reset the input for each iteration of the while loop
            correctInput = false;

            System.out.println("""
                What shape do you want to calculate the volume of?
                1) Cube
                2) Cylinder
                3) Sphere
                4) Square Pyramid
                0) Exit Program""");

            try{
                input = myObj.nextInt(); //get user input for the shape they want
            }catch (InputMismatchException ime){
                System.out.println("This input is invalid");
                myObj.next(); //progress scanner obj from invalid input
            }

            switch (input) {
                case 0 -> {}
                case 1 -> cubeVolume(getLength());
                case 2 -> cylinderVolume(getRadius(), getLength());
                case 3 -> sphereVolume(getRadius());
                case 4 -> squarePyramidVolume(getLength(), getHeight());
                case 5 -> equilateralTriangularPrism(getLength(), getBaseWidth());
                default -> {
                    System.out.println("Please input a number from the menu");
                }
            }//call methods based on the user input selection
        }
    }

    private static double getHeight() {
        double height = 0.0;

        while (!correctInput) {
            try{
                System.out.println("What is the height?");
                correctInput = true;
                height = myObj.nextDouble();
            }catch (InputMismatchException ime){
                correctInput = false;
                myObj.next();
                System.out.println("This input is invalid");
            }
        }

        return height;
    }//get user input for the height of the shape

    private static double getLength() {
        double length = 0.0;

        while (!correctInput) {
            try{
                System.out.println("What is the length?");
                correctInput = true;
                length = myObj.nextDouble();
            }catch (InputMismatchException ime){
                correctInput = false;
                myObj.next();
                System.out.println("This input is invalid");
            }
        }

        return length;
    }//get user input for the length of the shape

    private static double getRadius() {
        double radius = 0.0;

        while (!correctInput) {
            try{
                System.out.println("What is the radius?");
                correctInput = true;
                radius = myObj.nextDouble();
            }catch (InputMismatchException ime){
                correctInput = false;
                myObj.next();
                System.out.println("This input is invalid");
            }
        }

        return radius;
    }//get user input for the radius of the shape

    private static double getBaseWidth() {
        double baseWidth = 0.0;

        while (!correctInput) {
            try{
                System.out.println("What is the base width?");
                correctInput = true;
                baseWidth = myObj.nextDouble();
            }catch (InputMismatchException ime){
                correctInput = false;
                myObj.next();
                System.out.println("This input is invalid");
            }
        }

        return baseWidth;
    }//get user input for the base width of the shape

    private static void sphereVolume(double radius) {
        System.out.println("The volume is: " + ((4.0/3.0)*pi*(radius*radius*radius)));
    }//get volume of a sphere

    private static void cylinderVolume(double radius, double length) {
        System.out.println("The volume is: " + (pi*(radius*radius)*length));
    }//get volume of a cylinder

    private static void cubeVolume(double length) {
        System.out.println("The volume is: " + length*length*length);
    }//get volume of a cube

    private static void squarePyramidVolume(double length, double height) {
        System.out.println("The volume is: " + (length*length*height)/3.0);
    }//get volume of a square pyramid

    private static void equilateralTriangularPrism(double length, double baseWidth) {
        System.out.println("The volume is: " + ((baseWidth*baseWidth)/2)*length);
    }
}