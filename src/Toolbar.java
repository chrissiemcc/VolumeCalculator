import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private StringListener textListener;

    public Toolbar() {
        setLayout(new FlowLayout());

        JButton btnCube = new JButton("Cube");
        JButton btnCylinder = new JButton("Cylinder");
        JButton btnSphere = new JButton("Sphere");
        JButton btnSquarePyramid = new JButton("Square Pyramid");
        JButton btnEquilateralTriangularPrism = new JButton("Equilateral Triangular Prism");
        JButton btnCuboid = new JButton("Cuboid");

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
