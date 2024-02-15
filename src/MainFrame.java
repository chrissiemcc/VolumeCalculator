import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Toolbar toolbar;

    public MainFrame() {
        super("Volume Calculator");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();

        add(toolbar, BorderLayout.NORTH);

        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
