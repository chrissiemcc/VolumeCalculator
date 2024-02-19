import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Toolbar toolbar;
    private TextPanel textPanel;

    public MainFrame() {
        super("Volume Calculator");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                if(text.equals("Cube")) textPanel.setCubePanel();
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
