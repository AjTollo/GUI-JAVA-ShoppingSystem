import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

public class UserLogin implements ActionListener {

    JFrame frame = new JFrame("Login");
    JPanel centerPanel = new JPanel();
    JPanel messagePanel = new JPanel();
    JTextField textUser, textPass;
    JLabel loginText, passText, welcomeText, messageLabel;
    JButton confirmbtn, reset;
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    UserLogin(HashMap<String, String> loginInfoOriginal) {

        // Frame
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 200));

        // All login Data
        loginInfo = loginInfoOriginal;

        // Panel
        centerPanel.setBackground(Color.GRAY);
        centerPanel.setPreferredSize(new Dimension(500, 500));
        centerPanel.setLayout(null);

        // Text Fields and Buttons
        welcomeText = new JLabel("LOGIN PAGE");
        welcomeText.setFont(new Font("Arial", Font.PLAIN, 20));
        welcomeText.setBounds(200, 50, 300, 100);

        loginText = new JLabel("Username:");
        loginText.setFont(new Font("Arial", Font.PLAIN, 15));
        loginText.setBounds(70, 200, 100, 30);
        textUser = new JTextField();
        textUser.setBounds(150, 200, 210, 25);

        passText = new JLabel("Password:");
        passText.setFont(new Font("Arial", Font.PLAIN, 15));
        passText.setBounds(70, 250, 100, 30);
        textPass = new JTextField();
        textPass.setBounds(150, 250, 210, 25);

        confirmbtn = new JButton("Login");
        confirmbtn.setFocusable(false);
        confirmbtn.setBounds(200, 300, 100, 20);
        confirmbtn.addActionListener(this);

        messagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        messagePanel.setBackground(Color.gray);
        messagePanel.setBounds(0, 340, 500, 30);
        messageLabel = new JLabel();
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        centerPanel.add(welcomeText);
        centerPanel.add(loginText);
        centerPanel.add(textUser);
        centerPanel.add(passText);
        centerPanel.add(textPass);
        centerPanel.add(confirmbtn);
        centerPanel.add(messagePanel);
        messagePanel.add(messageLabel);
        // Frame Components

        frame.add(centerPanel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmbtn) {
            String userID = textUser.getText();
            String password = textPass.getText();

            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successfully!");
                    frame.dispose();
                    Shop s = new Shop();

                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Couldn't Find the user or the password ");
            }
        }
    }

}
