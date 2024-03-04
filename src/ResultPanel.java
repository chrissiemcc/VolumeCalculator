import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    public ResultPanel() {
        JButton btnCalculate = new JButton("Calculate");
        add(btnCalculate);

        setLayout(new FlowLayout());
    }
}
