package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public
class Signup extends JFrame implements ActionListener
{

    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7;
    JRadioButton r1, r2, r3, r4, r5;
    JButton btn;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup()
    {

        setTitle("NEW ACCOUNT APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img_label = new JLabel(i3);
        img_label.setBounds(20, 0, 100, 100);
        add(img_label);

        label1 = new JLabel("APPLICATION FORM NO. " + first);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));

        label2 = new JLabel("Page 1: Personal Details");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));

        label3 = new JLabel("Name:");
        label3.setFont(new Font("Raleway", Font.BOLD, 20));

        label4 = new JLabel("Father's Name:");
        label4.setFont(new Font("Raleway", Font.BOLD, 20));

        label5 = new JLabel("Date of Birth:");
        label5.setFont(new Font("Raleway", Font.BOLD, 20));

        label6 = new JLabel("Gender:");
        label6.setFont(new Font("Raleway", Font.BOLD, 20));

        label7 = new JLabel("Email Address:");
        label7.setFont(new Font("Raleway", Font.BOLD, 20));

        label8 = new JLabel("Marital Status:");
        label8.setFont(new Font("Raleway", Font.BOLD, 20));

        label9 = new JLabel("Address:");
        label9.setFont(new Font("Raleway", Font.BOLD, 20));

        label10 = new JLabel("City:");
        label10.setFont(new Font("Raleway", Font.BOLD, 20));

        label11 = new JLabel("Pin Code:");
        label11.setFont(new Font("Raleway", Font.BOLD, 20));

        label12 = new JLabel("State:");
        label12.setFont(new Font("Raleway", Font.BOLD, 20));

        label13 = new JLabel("Date");
        label13.setFont(new Font("Raleway", Font.BOLD, 14));

        label14 = new JLabel("Month");
        label14.setFont(new Font("Raleway", Font.BOLD, 14));

        label15 = new JLabel("Year");
        label15.setFont(new Font("Raleway", Font.BOLD, 14));

        txt1 = new JTextField();
        txt1.setFont(new Font("Raleway", Font.BOLD, 14));

        txt2 = new JTextField();
        txt2.setFont(new Font("Raleway", Font.BOLD, 14));

        txt3 = new JTextField();
        txt3.setFont(new Font("Raleway", Font.BOLD, 14));

        txt4 = new JTextField();
        txt4.setFont(new Font("Raleway", Font.BOLD, 14));

        txt5 = new JTextField();
        txt5.setFont(new Font("Raleway", Font.BOLD, 14));

        txt6 = new JTextField();
        txt6.setFont(new Font("Raleway", Font.BOLD, 14));

        txt7 = new JTextField();
        txt7.setFont(new Font("Raleway", Font.BOLD, 14));

        btn = new JButton("Next");
        btn.setFont(new Font("Raleway", Font.BOLD, 14));
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);

        setLayout(null);
        label1.setBounds(140, 20, 600, 40);
        add(label1);

        label2.setBounds(290, 80, 600, 30);
        add(label2);

        label3.setBounds(100, 140, 100, 30);
        add(label3);

        txt1.setBounds(300, 140, 400, 30);
        add(txt1);

        label4.setBounds(100, 190, 200, 30);
        add(label4);

        txt2.setBounds(300, 190, 400, 30);
        add(txt2);

        label5.setBounds(100, 240, 200, 30);
        add(label5);

        dateChooser.setBounds(300, 240, 400, 30);

        label6.setBounds(100, 290, 200, 30);
        add(label6);

        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2.setBounds(450, 290, 90, 30);
        add(r2);

        label7.setBounds(100, 340, 200, 30);
        add(label7);

        txt3.setBounds(300, 340, 400, 30);
        add(txt3);

        label8.setBounds(100, 390, 200, 30);
        add(label8);

        r3.setBounds(300, 390, 100, 30);
        add(r3);

        r4.setBounds(450, 390, 100, 30);
        add(r4);

        r5.setBounds(635, 390, 100, 30);
        add(r5);

        label9.setBounds(100, 440, 200, 30);
        add(label9);

        txt4.setBounds(300, 440, 400, 30);
        add(txt4);

        label10.setBounds(100, 490, 200, 30);
        add(label10);

        txt5.setBounds(300, 490, 400, 30);
        add(txt5);

        label11.setBounds(100, 540, 200, 30);
        add(label11);

        txt6.setBounds(300, 540, 400, 30);
        add(txt6);

        label12.setBounds(100, 590, 200, 30);
        add(label12);

        txt7.setBounds(300, 590, 400, 30);
        add(txt7);

        btn.setBounds(620, 660, 80, 30);
        add(btn);

        btn.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);
    }

public
    void actionPerformed(ActionEvent ap)
    {

        String formno = first;
        String name = txt1.getText();
        String fname = txt2.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected())
        {
            gender = "Male";
        }
        else if (r2.isSelected())
        {
            gender = "Female";
        }

        String email = txt3.getText();
        String marital = null;
        if (r3.isSelected())
        {
            marital = "Married";
        }
        else if (r4.isSelected())
        {
            marital = "Unmarried";
        }
        else if (r5.isSelected())
        {
            marital = "Other";
        }

        String address = txt4.getText();
        String city = txt5.getText();
        String pincode = txt6.getText();
        String state = txt7.getText();

        try
        {

            if (txt6.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please fill the required fields");
            }
            else
            {
                Conn c1 = new Conn();
                String q1 = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
                c1.s.executeUpdate(q1);

                new Signup2(first).setVisible(true);
                setVisible(false);
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
        new Signup().setVisible(true);
    }
}
