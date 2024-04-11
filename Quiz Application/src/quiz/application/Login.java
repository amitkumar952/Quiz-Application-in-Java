package quiz.application;
import javax.swing.*; // java ke extends package se ata hai swing package isliye use kerna hai javax
import java.awt.*;                   //color class hoti hai AWT package ke under
import java.awt.event.*;



public class Login extends JFrame implements ActionListener{ //click event ke ActionListner interface ka use kerna padta hai
    
  
    JButton rules, back;
    JTextField  tfname;
      
    Login(){ // constractor
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); //setlayout null kerne ka matlab hai ki ab hume swing ka layout nhi chahiye hame khud ka layout use kerna hai
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        //kisi bhi component ko Frame ke upper place kerne ke add function ka use kerte hai
        JLabel image = new JLabel(i1); // hum direct add fuction mein obj(i1) ko nhi dal sakte isliye ek jlable class ka obj banana padega
        image.setBounds(0, 0, 600, 500); // setbounda ka use hum khud ka layout banane ke liye kerte hai
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254)); //Color.BLUE ese bhi color le sakte ho
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254)); //Color.BLUE ese bhi color le sakte ho
        add(name);
        
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
      //Button
      rules = new JButton("Rules");
      rules.setBounds(735, 270, 120, 25);
      rules.setBackground(new Color(30, 144, 144));
      rules.setForeground(Color.WHITE);
      rules.addActionListener(this);
      add(rules);
      
      
      back = new JButton("Back");
      back.setBounds(915, 270, 120, 25);
      back.setBackground(new Color(30, 144, 144));
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);
      
        
        
        
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if(ae.getSource() == back){
            setVisible(false);
            
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
