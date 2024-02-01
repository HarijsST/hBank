package JFrame;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public JFrame frame;
    public JPanel panel;
    public JPanel panelRight;
    public JPanel panelLeft;
    public JPanel clearPanel;
    public static JLabel label;
    public static JTextField textField;

    public void initialize(){
        frame = new JFrame();
        frame.setLayout(new BorderLayout(10, 5));
        frame.setTitle("JFrame programma");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        Panels panels = new Panels();
        frame.add(panels.headerPanel(), BorderLayout.NORTH);
        frame.add(panels.panelLeft(), BorderLayout.WEST);
        frame.add(panels.panelRight(), BorderLayout.EAST);
        frame.add(panels.clearPanel(), BorderLayout.SOUTH);

        label = new JLabel();
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 16));

        textField = createTextField();
        panels.panelLeft.add(textField);
        panels.panelRight.add(label);

        Buttons button = new Buttons();
        panels.panel.add(button.textButton());
        panels.panel.add(button.wordsCount());
        panels.panel.add(button.symbolCount());
        panels.clearPanel.add(button.clear());
        panels.panel.add(button.longestWordButton());
    }
    public JTextField createTextField(){
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.BOLD, 16));
        textField.setForeground(Color.BLUE);
        textField.setBackground(Color.ORANGE);
        textField.setMargin(new Insets(5, 10, 5, 10));
        return textField;
    }
}
