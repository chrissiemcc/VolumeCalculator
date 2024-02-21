import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Toolbar toolbar;
    private DataPanel dataPanel;

    public MainFrame() {
        super("Volume Calculator");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        dataPanel = new DataPanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                if(text.equals("Cube")) dataPanel.setCubePanel();
                if(text.equals("Cylinder")) dataPanel.setCylinderPanel();
                if(text.equals("Sphere")) dataPanel.setSpherePanel();
                if(text.equals("Square Pyramid")) dataPanel.setSquarePyramidPanel();
                if(text.equals("Equilateral Triangular Prism")) dataPanel.setEquilateralTriangularPrismPanel();
                if(text.equals("Cuboid")) dataPanel.setCuboidPanel();
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(dataPanel, BorderLayout.CENTER);

        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
