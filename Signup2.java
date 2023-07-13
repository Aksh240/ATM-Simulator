package ATMSimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel label1, label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JButton btn;
    JRadioButton r1,r2,r3,r4;
    JTextField txt1,txt2;
    JComboBox c1,c2,c3,c4,c5;
    String formno;
    Signup2(String formno){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ATMSimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img_label = new JLabel(i3);
        img_label.setBounds(150, 0, 100, 100);
        add(img_label);
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        label1 = new JLabel("Page 2: Additonal Details");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        label2 = new JLabel("Religion:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));;
        
        label3 = new JLabel("Category:");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label4 = new JLabel("Income:");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label5 = new JLabel("Educational");
        label5.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label11 = new JLabel("Qualification:");
        label11.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label6 = new JLabel("Occupation:");
        label6.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label7 = new JLabel("PAN Number:");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label8 = new JLabel("Aadhar Number:");
        label8.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label9 = new JLabel("Senior Citizen:");
        label9.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label10 = new JLabel("Existing Account:");
        label10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        label12 = new JLabel("Form No:");
        label12.setFont(new Font("Raleway", Font.BOLD, 13));
        
        label13 = new JLabel(formno);
        label13.setFont(new Font("Raleway", Font.BOLD, 13));
        
        btn = new JButton("Next");
        btn.setFont(new Font("Raleway", Font.BOLD, 14));
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        
        txt1 = new JTextField();
        txt1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        txt2 = new JTextField();
        txt2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
       
        
        setLayout(null);
        
        
        label12.setBounds(700,10,60,30);
        add(label12);
        
        label13.setBounds(760,10,60,30);
        add(label13);
        
        label1.setBounds(280,30,600,40);
        add(label1);
        
        label2.setBounds(100,120,100,30);
        add(label2);
        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        label3.setBounds(100,170,100,30);
        add(label3);
        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        label4.setBounds(100,220,100,30);
        add(label4);
        
        c3.setBounds(350,220,320,30);
        add(c3);
        
        label5.setBounds(100,270,150,30);
        add(label5);
        
        c4.setBounds(350,270,320,30);
        add(c4);
        
        label11.setBounds(100,290,150,30);
        add(label11);
        
        label6.setBounds(100,340,150,30);
        add(label6);
        
        c5.setBounds(350,340,320,30);
        add(c5);
        
        label7.setBounds(100,390,150,30);
        add(label7);
        
        txt1.setBounds(350,390,320,30);
        add(txt1);
        
        label8.setBounds(100,440,180,30);
        add(label8);
        
        txt2.setBounds(350,440,320,30);
        add(txt2);
        
        label9.setBounds(100,490,150,30);
        add(label9);
        
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2.setBounds(460,490,100,30);
        add(r2);
        
        label10.setBounds(100,540,180,30);
        add(label10);
        
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        btn.setBounds(570,640,100,30);
        add(btn);
        
        btn.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,750);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = txt1.getText();
        String aadhar = txt2.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
        try{
            if(txt2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    
               
    }
    
    
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}