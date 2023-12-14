package fourthLab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock Application");
        JLabel label = new JLabel();

        ClockExt2 clock = new ClockExt2(12, 0, 0, 0);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clock.nextMillisecond();
                label.setText(String.format("%02d:%02d:%02d.%03d",
                        clock.getHours(), clock.getMinutes(), clock.getSeconds(), clock.getMilliseconds()));
            }
        });

        timer.start();

        frame.getContentPane().add(label);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
