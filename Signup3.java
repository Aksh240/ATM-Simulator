
package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public
class Signup3 extends JFrame implements ActionListener
{

    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
    JRadioButton r1, r2, r3, r4;
    JButton btn1, btn2;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String formno;
    Signup3(String formno)
    {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img_label = new JLabel(i3);
        img_label.setBounds(150, 0, 100, 100);
        add(img_label);

        label1 = new JLabel("Page 3: Account Details");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));

        label2 = new JLabel("Account Type:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));

        label3 = new JLabel("Card Number:");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));

        label4 = new JLabel("XXXX-XXXX-XXXX-4184");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));

        label5 = new JLabel("(Your 16-digit Card number)");
        label5.setFont(new Font("Raleway", Font.BOLD, 12));

        label6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        label6.setFont(new Font("Raleway", Font.BOLD, 12));

        label7 = new JLabel("PIN:");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));

        label8 = new JLabel("XXXX");
        label8.setFont(new Font("Raleway", Font.BOLD, 18));

        label9 = new JLabel("(4-digit password)");
        label9.setFont(new Font("Raleway", Font.BOLD, 12));

        label10 = new JLabel("Services Required:");
        label10.setFont(new Font("Raleway", Font.BOLD, 18));

        label11 = new JLabel("Form No:");
        label11.setFont(new Font("Raleway", Font.BOLD, 14));

        label12 = new JLabel(formno);
        label12.setFont(new Font("Raleway", Font.BOLD, 14));

        btn1 = new JButton("Submit");
        btn1.setFont(new Font("Raleway", Font.BOLD, 14));
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);

        btn2 = new JButton("Cancel");
        btn2.setFont(new Font("Raleway", Font.BOLD, 14));
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));

        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);

        setLayout(null);

        label11.setBounds(700, 10, 70, 30);
        add(label11);

        label12.setBounds(770, 10, 40, 30);
        add(label12);

        label1.setBounds(280, 40, 400, 40);
        add(label1);

        label2.setBounds(100, 140, 200, 30);
        add(label2);

        r1.setBounds(100, 180, 150, 30);
        add(r1);

        r2.setBounds(350, 180, 300, 30);
        add(r2);

        r3.setBounds(100, 220, 250, 30);
        add(r3);

        r4.setBounds(350, 220, 250, 30);
        add(r4);

        label3.setBounds(100, 300, 200, 30);
        add(label3);

        label4.setBounds(330, 300, 250, 30);
        add(label4);

        label5.setBounds(100, 330, 200, 20);
        add(label5);

        label6.setBounds(330, 330, 500, 20);
        add(label6);

        label7.setBounds(100, 370, 200, 30);
        add(label7);

        label8.setBounds(330, 370, 200, 30);
        add(label8);

        label9.setBounds(100, 400, 200, 20);
        add(label9);

        label10.setBounds(100, 450, 200, 30);
        add(label10);

        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7.setBounds(100, 680, 600, 20);
        add(c7);

        btn1.setBounds(250, 720, 100, 30);
        add(btn1);

        btn2.setBounds(420, 720, 100, 30);
        add(btn2);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 850);
        setLocation(500, 120);
        setVisible(true);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

public
    void actionPerformed(ActionEvent ap)
    {
        String atype = null;
        if (r1.isSelected())
        {
            atype = "Saving Account";
        }
        else if (r2.isSelected())
        {
            atype = "Fixed Deposit Account";
        }
        else if (r3.isSelected())
        {
            atype = "Current Account";
        }
        else if (r4.isSelected())
        {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if (c1.isSelected())
        {
            facility = facility + " ATM Card";
        }
        if (c2.isSelected())
        {
            facility = facility + " Internet Banking";
        }
        if (c3.isSelected())
        {
            facility = facility + " Mobile Banking";
        }
        if (c4.isSelected())
        {
            facility = facility + " EMAIL Alerts";
        }
        if (c5.isSelected())
        {
            facility = facility + " Cheque Book";
        }
        if (c6.isSelected())
        {
            facility = facility + " E-Statement";
        }

        try
        {
            if (ap.getSource() == btn1)
            {

                if (atype.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
                else
                {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + facility + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:" + pin);

                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            }
            else if (ap.getSource() == btn2)
            {
                System.exit(0);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

public
    static void main(String[] args)
    {
        new Signup3("").setVisible(true);
    }
}
