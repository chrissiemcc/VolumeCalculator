import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private JButton btnCube;
    private JButton btnCylinder;
    private JButton btnSphere;
    private JButton btnSquarePyramid;
    private JButton btnEquilateralTriangularPrism;
    private JButton btnCuboid;

    public Toolbar() {
        btnCube = new JButton("Cube");
        btnCylinder = new JButton("Cylinder");
        btnSphere = new JButton("Sphere");
        btnSquarePyramid = new JButton("Square Pyramid");
        btnEquilateralTriangularPrism = new JButton("Equilateral Triangular Prism");
        btnCuboid = new JButton("Cuboid");

        setLayout(new FlowLayout());

        add(btnCube);
        add(btnCylinder);
        add(btnSphere);
        add(btnSquarePyramid);
        add(btnEquilateralTriangularPrism);
        add(btnCuboid);
    }
}
