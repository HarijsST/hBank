package JFrame;

import javax.swing.*;
import java.awt.*;

public class Panels extends MainFrame {
    public JPanel headerPanel(){
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.RED);
        return panel;
    }
    public JPanel panelLeft(){
        panelLeft = new JPanel();
        panelLeft.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 25));
        panelLeft.setBackground(Color.BLUE);
        return panelLeft;
    }
    public JPanel panelRight(){
        panelRight = new JPanel();
        panelRight.setBorder(BorderFactory.createEmptyBorder(20, 300, 20, 20));
        panelRight.setBackground(Color.GREEN);
        return panelRight;
    }
    public JPanel clearPanel(){
        clearPanel = new JPanel();
        clearPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        clearPanel.setBackground(Color.CYAN);
        return clearPanel;
    }
}
