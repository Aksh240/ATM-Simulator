package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel label1;
    JButton button1,button2,button3,button4,button5,button6,button7;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label2 = new JLabel(i3);
        label2.setBounds(0, 0, 960, 1080);
        add(label2);
        
        label1 = new JLabel("Please Select Your Transaction");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        
       
        button1 = new JButton("DEPOSIT");
        button2 = new JButton("CASH WITHDRAWL");
        button3 = new JButton("FAST CASH");
        button4 = new JButton("MINI STATEMENT");
        button5 = new JButton("PIN CHANGE");
        button6 = new JButton("BALANCE ENQUIRY");
        button7 = new JButton("EXIT");
        
        setLayout(null);
        
        label1.setBounds(235,400,700,35);
        label2.add(label1);
        
        button1.setBounds(170,499,150,35);
        label2.add(button1);
        
        button2.setBounds(390,499,150,35);
        label2.add(button2);
        
        button3.setBounds(170,543,150,35);
        label2.add(button3);
        
        button4.setBounds(390,543,150,35);
        label2.add(button4);
        
        button5.setBounds(170,588,150,35);
        label2.add(button5);
        
        button6.setBounds(390,588,150,35);
        label2.add(button6);
        
        button7.setBounds(390,633,150,35);
        label2.add(button7);
        
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==button1){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==button2){ 
            setVisible(false);
            new Withdrawal(pin).setVisible(true);
        }else if(ae.getSource()==button3){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==button4){ 
            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()==button5){ 
            setVisible(false);
            new Pin(pin).setVisible(true);
        }else if(ae.getSource()==button6){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==button7){ 
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }
}