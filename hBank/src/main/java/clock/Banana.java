package clock;

import javax.swing.*;
import java.awt.*;

public class Banana extends JFrame {

    Banana() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Banana");
        this.setLayout(new FlowLayout());
        this.setSize(350, 320);
        this.setResizable(true);

        this.add(new JLabel("Hello World!"));

        this.setVisible(true);
    }

    public static void main(String[] args) {
            new Banana();
    }
}
