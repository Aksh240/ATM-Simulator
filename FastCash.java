package ATMSimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel label1, label2;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label3 = new JLabel(i3);
        label3.setBounds(0, 0, 960, 1080);
        add(label3);

        label1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));

        btn1 = new JButton("Rs 100");
        btn2 = new JButton("Rs 500");
        btn3 = new JButton("Rs 1000");
        btn4 = new JButton("Rs 2000");
        btn5 = new JButton("Rs 5000");
        btn6 = new JButton("Rs 10000");
        btn7 = new JButton("BACK");

        setLayout(null);

        label1.setBounds(235, 400, 700, 35);
        label3.add(label1);

        btn1.setBounds(170, 499, 150, 35);
        label3.add(btn1);

        btn2.setBounds(390, 499, 150, 35);
        label3.add(btn2);

        btn3.setBounds(170, 543, 150, 35);
        label3.add(btn3);

        btn4.setBounds(390, 543, 150, 35);
        label3.add(btn4);

        btn5.setBounds(170, 588, 150, 35);
        label3.add(btn5);

        btn6.setBounds(390, 588, 150, 35);
        label3.add(btn6);

        btn7.setBounds(390, 633, 150, 35);
        label3.add(btn7);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);

        setSize(960, 1080);
        setLocation(500, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //k
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("mode").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }// String num = "17";
            if (ae.getSource() != btn7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == btn7) {
                this.setVisible(false);
                new Transactions(pin).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
