package wordCounterWithJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterWithJFrame extends JFrame {
    String textInput;
    private JButton button;
   WordCounterWithJFrame() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("Word Counter With JFrame");
       test();
       this.setLayout(new FlowLayout());
       this.setSize(350, 320);
       this.setResizable(false);
   }

   public void test(){
       JLabel heading = new JLabel("Ievadīt tekstu, lai aprēķinātu vārdu daudzumu");
       add(createJTextField());
       button = new JButton("Aprēķināt");
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println(countWord(textInput));
           }
       });

       setLayout(new FlowLayout());

       add(heading);

       add(button);
   }
    public JTextField createJTextField(){
        JTextField textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.BOLD, 16));
        textField.setForeground(Color.BLUE);
        textField.setBackground(Color.yellow);
        textField.setMargin(new Insets(5, 10, 5, 10));
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel();
                label.setText(textField.getText());
            }
        });
        return textField;
    }
    public int countWord(String textInput){
        return textInput.split(" ").length;
    }


    public static void main(String[] args) {
        new WordCounterWithJFrame().setVisible(true);
    }

}
