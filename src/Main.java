import java.util.Scanner;

public class Main {
    static final double pi = 3.14159265359;
    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        int input = 1;
        while(input != 0){
            System.out.println("""
                What shape do you want to calculate the volume of?
                1) Cube
                2) Cylinder
                3) Sphere
                0) Exit Program""");
            input = myObj.nextInt(); //get user input for the shape they want

            switch (input) {
                case 1 -> cubeVolume(getLength());
                case 2 -> cylinderVolume(getRadius(), getLength());
                case 3 -> sphereVolume(getRadius());
                default -> {}
            }//call methods based on the user input
        }
    }

    private static double getLength() {
        System.out.println("What is the length?");
        return myObj.nextDouble();
    }//get user input for the length of the shape

    private static double getRadius() {
        System.out.println("What is the radius?");
        return myObj.nextDouble();
    }//get user input for the radius of the shape

    private static void sphereVolume(double radius) {
        System.out.println("The volume is: " + ((4.0/3.0)*pi*(radius*radius*radius)));
    }//get volume of a sphere

    private static void cylinderVolume(double radius, double length) {
        System.out.println("The volume is: " + (pi*(radius*radius)*length));
    }//get volume of a cylinder

    private static void cubeVolume(double length) {
        System.out.println("The volume is: " + length*length*length);
    }//get volume of a cube
}