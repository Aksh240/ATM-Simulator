
package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.sql.*;

public class Withdrawal extends JFrame implements ActionListener{
    
    JTextField text1;
    JButton button1,button2,button3;
    JLabel label1;
    String pin;
    Withdrawal(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label2 = new JLabel(i3);
        label2.setBounds(0, 0, 960, 1080);
        add(label2);
        
              
        label1 = new JLabel("Enter your Withdrawal Amount");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        
        text1 = new JTextField();
        text1.setFont(new Font("Raleway", Font.BOLD, 25));
        
        button1 = new JButton("WITHDRAW");
        button2 = new JButton("BACK");
        
        setLayout(null);
        
              
        label1.setBounds(190,400,400,20);
        label2.add(label1);
        
        text1.setBounds(190,450,330,30);
        label2.add(text1);
        
        button1.setBounds(390,588,150,35);
        label2.add(button1);
        
        button2.setBounds(390,633,150,35);
        label2.add(button2);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = text1.getText();
            Date date = new Date();
            if(ae.getSource()==button1){
                if(text1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }else{
                    Conn c1 = new Conn();
                    
                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pin+"'");
                    int balance = 0;
                    while(rs.next()){
                       if(rs.getString("mode").equals("Deposit")){
                           balance += Integer.parseInt(rs.getString("amount"));
                       }else{
                           balance -= Integer.parseInt(rs.getString("amount"));
                       }
                    }
                    if(balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }
                    
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==button2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }

    
    
    public static void main(String[] args){
        new Withdrawal("").setVisible(true);
    }
}
