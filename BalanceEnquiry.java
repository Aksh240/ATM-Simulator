package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;

class BalanceEnquiry extends JFrame implements ActionListener {

    JTextField txt1, txt2;
    JButton btn1, btn2, btn3;
    JLabel label1, label2, label3;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label3 = new JLabel(i3);
        label3.setBounds(0, 0, 960, 1080);
        add(label3);

        label1 = new JLabel();
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));

        btn1 = new JButton("BACK");

        setLayout(null);

        label1.setBounds(190, 350, 400, 35);
        label3.add(label1);

        btn1.setBounds(390, 633, 150, 35);
        label3.add(btn1);
        int balance = 0;
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pin+"'");
            while (rs.next()) {
                if (rs.getString("mode").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){}
        
        label1.setText("Your Current Account Balance is Rs "+balance);

        btn1.addActionListener(this);

        setSize(960, 1080);
        setUndecorated(true);
        setLocation(500, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
