import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

public class Shop implements ActionListener {

    JFrame frame = new JFrame("Shop");

    Shop() {
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 200));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
