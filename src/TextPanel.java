import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    private JLabel lblSelectedShape;

    public TextPanel() {
        //lblSelectedShape = new JLabel("Default");

        textArea = new JTextArea();

        setLayout(new BorderLayout());
        add(textArea);
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}
