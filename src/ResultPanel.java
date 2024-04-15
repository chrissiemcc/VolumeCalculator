import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    public ResultPanel() {
        JButton btnCalculate = new JButton("Calculate");
        JLabel lblResult = new JLabel("Result");

        add(lblResult);
        add(btnCalculate);

        setLayout(new FlowLayout());
    }
}
