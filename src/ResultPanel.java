import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    public ResultPanel() {
        setLayout(new FlowLayout());

        JButton btnCalculate = new JButton("Calculate");
        add(btnCalculate);
    }
}
