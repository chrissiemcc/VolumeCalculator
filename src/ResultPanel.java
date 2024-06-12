import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    public ResultPanel() {
        setLayout(new FlowLayout());

        JButton btnCalculate = new JButton("Calculate");
        JLabel lblResult = new JLabel("Result");

        add(lblResult);
        add(btnCalculate);

        lblResult.setVisible(false);
    }
}
