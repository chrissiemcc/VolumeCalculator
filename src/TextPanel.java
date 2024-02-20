import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextPanel extends JPanel {
    private final JTextField txtLength = new JTextField(10);
    private final JTextField txtHeight = new JTextField(10);
    private final JTextField txtWidth = new JTextField(10);
    private final JLabel lblLength = new JLabel("Length:");
    private final JLabel lblHeight = new JLabel("Height:");
    private final JLabel lblWidth = new JLabel("Width:");
    GridBagConstraints gc = new GridBagConstraints();

    public TextPanel() {
        Border innerBorder = BorderFactory.createTitledBorder("Volume Calculator");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());
    }

    public void setCubePanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        refreshPanel();
    }

    public void setCuboidPanel() {
        clearPanel();

        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        add(lblLength, gc);

        gc.gridx = 1;
        add(txtLength, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(lblHeight, gc);

        gc.gridx = 1;
        add(txtHeight, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(lblWidth, gc);

        gc.gridx = 1;
        add(txtWidth, gc);

        refreshPanel();
    }

    public void clearPanel() {

        this.removeAll();
    }

    public void refreshPanel() {
        this.revalidate();
        this.repaint();
    }
}
