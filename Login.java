package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public
class Login extends JFrame implements ActionListener
{
    JLabel label1, label2, label3;
    JTextField txtfield1;
    JPasswordField pf1;
    JButton btn1, btn2, btn3;

    Login()
    {
        setTitle("ATM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img_label1 = new JLabel(i3);
        img_label1.setBounds(70, 10, 100, 100);
        add(img_label1);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("Osward", Font.BOLD, 38));
        label1.setBounds(200, 40, 450, 40);
        add(label1);

        label2 = new JLabel("ATMCardNo:");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setBounds(125, 150, 375, 30);
        add(label2);

        txtfield1 = new JTextField(15);
        txtfield1.setBounds(300, 150, 230, 30);
        txtfield1.setFont(new Font("Arial", Font.BOLD, 14));
        add(txtfield1);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setBounds(125, 220, 375, 30);
        add(label3);

        pf1 = new JPasswordField(15);
        pf1.setFont(new Font("Arial", Font.BOLD, 14));
        pf1.setBounds(300, 220, 230, 30);
        add(pf1);

        btn1 = new JButton("SIGN IN");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);

        btn2 = new JButton("CLEAR");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn3 = new JButton("SIGN UP");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);

        setLayout(null);

        btn1.setFont(new Font("Arial", Font.BOLD, 14));
        btn1.setBounds(300, 300, 100, 30);
        add(btn1);

        btn2.setFont(new Font("Arial", Font.BOLD, 14));
        btn2.setBounds(430, 300, 100, 30);
        add(btn2);

        btn3.setFont(new Font("Arial", Font.BOLD, 14));
        btn3.setBounds(300, 350, 230, 30);
        add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(550, 200);
        setVisible(true);
    }
public
    void actionPerformed(ActionEvent ap)
    {
        try
        {
            if (ap.getSource() == btn1)
            {
                Conn c1 = new Conn();
                String cardno = txtfield1.getText();
                String pin = pf1.getText();
                String q = "select * from login where cardno = '" + cardno + "' and pin = '" + pin + "'";

                ResultSet rs = c1.s.executeQuery(q);
                if (rs.next())
                {
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }
            else if (ap.getSource() == btn2)
            {
                txtfield1.setText("");
                pf1.setText("");
            }
            else if (ap.getSource() == btn3)
            {
                setVisible(false);
                new Signup().setVisible(true);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
public
    static void main(String[] args)
    {
        new Login().setVisible(true);
    }
}
