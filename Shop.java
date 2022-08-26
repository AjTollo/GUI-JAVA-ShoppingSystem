import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Shop implements ActionListener {

    JFrame frame = new JFrame("Shop");
    JTable tb = new JTable();
    JPanel lPanel, rPanel;
    JTextField textItemID, textPrice, textQuantity;
    JButton buyBtn, removeBtn;
    JLabel CartLabel;
    Object[] row = new Object[3];
    Font font = new Font("Arial", 1, 12);
    ShopItems shopItems;

    Shop() {
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        // Panels
        lPanel = new JPanel();
        lPanel.setPreferredSize(new Dimension(700, 1000));
        lPanel.setBackground(Color.GRAY);

        rPanel = new JPanel();
        rPanel.setPreferredSize(new Dimension(300, 1000));
        rPanel.setBackground(Color.DARK_GRAY);
        rPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Right Panel
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = { "Name", "Price", "Qty" };

        model.setColumnIdentifiers(columns);
        tb.setModel(model);

        tb.setBackground(Color.LIGHT_GRAY);
        tb.setForeground(Color.black);
        tb.setFont(font);
        tb.setRowHeight(15);

        JScrollPane pane = new JScrollPane(tb);
        pane.setBounds(10, 10, 280, 500);

        buyBtn = new JButton("Buy");
        buyBtn.setBounds(50, 550, 100, 30);
        buyBtn.addActionListener(this);

        removeBtn = new JButton("Remove");
        removeBtn.setBounds(155, 550, 100, 30);
        removeBtn.addActionListener(this);

        rPanel.add(buyBtn);
        rPanel.add(removeBtn);
        rPanel.add(pane);

        // Left Panel

        // frame
        frame.add(rPanel, BorderLayout.EAST);
        frame.add(lPanel, BorderLayout.WEST);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
