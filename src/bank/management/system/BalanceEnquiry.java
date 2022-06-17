
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BalanceEnquiry extends JFrame implements ActionListener{
       String pinnumber;
       JButton back;
       
   BalanceEnquiry(String pinnumber){
              
                 this.pinnumber = pinnumber;
        
            setLayout(null);
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0,0,900,900);
            add(image);                   
             
            int balance =0;
            try{
                Conn c = new Conn();
                ResultSet res = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                   
                    while(res.next()){
                        if(res.getString("type").equals("Deposite")){
                            balance = balance + Integer.parseInt(res.getString("amount"));
                        }else{
                            balance -= Integer.parseInt(res.getString("amount"));
                        }
                    }
            }catch(Exception e){
                System.out.println(e);
            }
            JLabel text = new JLabel("Your Balance is :Rs."+balance);
            text.setBounds(155,300,500,30);
            text.setFont(new Font("Arial",Font.BOLD,25));
            text.setForeground(Color.WHITE);
            image.add(text);
            
             back = new JButton("BACK");
            back.setBounds(360,520,150,30);
            back.setFont(new Font("Arial",Font.BOLD,16));
            back.addActionListener(this);
            image.add(back);
            
              setSize(900,900);
             setLocation(300,0);
             setVisible(true);
                   }
 
                 public void actionPerformed(ActionEvent ae){
                     if(ae.getSource()== back){
                         setVisible(false);
                         new Transaction(pinnumber).setVisible(true);
                         
                     }
                 }                 
   
              public static void main(String args[]){
                       new BalanceEnquiry("");
                   }
}
