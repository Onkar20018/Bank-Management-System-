
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener {
   
    
    JButton withdrawl,deposite,minstatement,pinchange,exit,balance,fastcash;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber = pinnumber;
          setLayout(null);    
        
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2  = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            
            image.setBounds(0,0,900,900);
            add(image);
           
            JLabel text = new JLabel("Please Select Your Transaction:");
            text.setBounds(235,300,700,35);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("Arial",Font.BOLD,16));
            image.add(text); // To add text above the image 
            

            deposite = new JButton("Deposite");
            deposite.setBounds(170,415,150,30);
            deposite.addActionListener(this);
            image.add(deposite);
            
             withdrawl = new JButton("Cash Withrawl");
            withdrawl.setBounds(355,415,150,30);
            withdrawl.addActionListener(this);
            image.add(withdrawl);
            
             fastcash = new JButton("FastCash");
            fastcash.setBounds(170,450,150,30);
            fastcash.addActionListener(this);
            image.add(fastcash);
            
             minstatement = new JButton("Mini Statement");
            minstatement.setBounds(355,450,150,30);
            minstatement.addActionListener(this);
            image.add(minstatement);
            
             pinchange = new JButton("PIN Change");
            pinchange.setBounds(170,485,150,30);
            pinchange.addActionListener(this);
            image.add(pinchange);
            
             balance = new JButton("Balance Enquiry");
            balance.setBounds(355,485,150,30);
            balance.addActionListener(this);
            image.add(balance);
            
             exit = new JButton("Exit");
            exit.setBounds(170,520,150,30);
            exit.addActionListener(this);
            image.add(exit);
            
            setSize(900,900);
              setLocation(300,0);
              setUndecorated(true);
              setVisible(true);
              
    }
    
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==exit){
             System.exit(0);
         }else if (e.getSource()==deposite){
             setVisible(false);
             new Deposite(pinnumber).setVisible(true);
         }else if (e.getSource()==withdrawl){
             setVisible(false);
             new Withdrawl(pinnumber).setVisible(true);
         }else if(e.getSource()== fastcash){
             new FastCash(pinnumber).setVisible(true);
         }else if (e.getSource()== pinchange ){
              setVisible(false);
             new PinChange(pinnumber).setVisible(true);
         }else if (e.getSource()==balance){
             setVisible(false);
             new BalanceEnquiry(pinnumber);
         }
    }
    
    public static void main(String args[]){
        new Transaction("");
        
    }
    
}
