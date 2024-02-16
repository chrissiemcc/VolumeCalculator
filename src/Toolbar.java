import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton btnCube, btnCylinder, btnSphere, btnSquarePyramid, btnEquilateralTriangularPrism, btnCuboid;
    private StringListener textListener;

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

        btnCube.addActionListener(this);
        btnCylinder.addActionListener(this);
        btnSphere.addActionListener(this);
        btnSquarePyramid.addActionListener(this);
        btnEquilateralTriangularPrism.addActionListener(this);
        btnCuboid.addActionListener(this);
    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (textListener != null) {
            switch (clicked.getText()) {
                case "Cube" -> textListener.textEmitted("Cube");
                case "Cylinder" -> textListener.textEmitted("Cylinder");
                case "Sphere" -> textListener.textEmitted("Sphere");
                case "Square Pyramid" -> textListener.textEmitted("Square Pyramid");
                case "Equilateral Triangular Prism" -> textListener.textEmitted("Equilateral Triangular Prism");
                case "Cuboid" -> textListener.textEmitted("Cuboid");
            }
        }
    }
}
