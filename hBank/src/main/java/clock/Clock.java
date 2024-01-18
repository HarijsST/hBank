package clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Clock extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    JButton button;
    JTextField field;
    String time;
    String day;
    String date;

    Clock() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 320);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("EEEE");
        dateFormat=new SimpleDateFormat("dd MMMMM, yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setOpaque(true);
        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.BOLD,34));

        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.BOLD,30));

        button = new JButton();
        button.setText("Hello world");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Logika kas notiek, kad piespiesta podziņa
                System.out.println("You just pushed a button!");
                //Loģikas beigas
            }
        });

        field = new JTextField();
        field.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Logika kas notiek, kad piespiesta podziņa
                System.out.println("You submited text");
                //Loģikas beigas
            }
        });


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.add(button);
        this.add(field);
        this.setVisible(true);

        setTimer();
    }

    public void setTimer() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        new Clock();
    }
}