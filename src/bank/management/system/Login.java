
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
      JButton login,clear,sign_up;
      JTextField cardTextField ;
      JPasswordField pinTextField;
        Login(){
            setTitle("Login Page");  // To set the Title
            setLayout(null); // To make Default layout null so that we can use our own layouts using SetBounds
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // To extract File from PC
            Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);// To Change the Size of the Image width,Heigh,Scale imported from awt
            ImageIcon i3 = new ImageIcon(i2); // TO Convert Image to Imageicon as Jlabel only accepts imageicon 
            JLabel label = new JLabel(i3); // 
            label.setBounds(70,20,100,100); // To give location of the lable in Frame
            add(label);
            
            JLabel text = new JLabel("Welcome to Bank System"); // To create a TExt in JFrame
            text.setFont(new Font("Osward",Font.BOLD,30));
            text.setBounds(200,30,400,40); // To give Location of the text
            add(text);
            
            // Below is for Card No:
            JLabel cardano = new JLabel("Card No:"); // To create a TExt in JFrame
            cardano.setFont(new Font("Raleway",Font.BOLD,25));
            cardano.setBounds(120,150,150,40); // To give Location of the text
            add(cardano);
            
            //To Take Input field from user for Card No:
             cardTextField = new JTextField();
            cardTextField.setBounds(250,160,230,30);
            add(cardTextField);
            
            // Below is for Pin NO:
            JLabel pin = new JLabel("Pin:"); // To create a TExt in JFrame
            pin.setFont(new Font("Osward",Font.BOLD,25));
            pin.setBounds(120,220,150,40); // To give Location of the text
            add(pin);
            
            // vTo Take Input field from user for Pin No:
             pinTextField = new JPasswordField();
            pinTextField.setBounds(250,230,230,30);
            add(pinTextField);
            
            
            // This is To Create Sign In Button
            login = new JButton("Sign  In");
            login.setBounds(250,300,100,30);
            //login.setBackground(Color.pink);
            //login.setForeground(Color.RED);
            login.addActionListener(this);  
            add(login);
            
            //This is To Create Clear Button
            clear  = new JButton("CLEAR");
            clear.setBounds(380,300,100,30);
            //clear.setBackground(Color.pink);
            //clear.setForeground(Color.RED);
            clear.addActionListener(this);
            add(clear);
            
            //This is To Create Sign Up Button
            sign_up  = new JButton("Sign Up");
            sign_up.setBounds(250,350,230,30);
            //sign_up.setBackground(Color.pink);
            //sign_up.setForeground(Color.RED);
            sign_up.addActionListener(this);
            add(sign_up);
            
            getContentPane().setBackground(Color.blue); // TO make chnages in Bavkground
            
            setSize(800,480); // To set dimensions of the Frame
            setVisible(true); // To see the Frame
            setLocation(350,200); 
        }  
        
        public void  actionPerformed(ActionEvent ae){
             if(ae.getSource()== clear){
                  cardTextField.setText("");
                  pinTextField.setText("");
             }else if(ae.getSource()== login){
               //    pinTextField.setText("sign is Done");
             }else if(ae.getSource()== sign_up) {
                    
             }
        }
     public static void main(String args[]){
       new Login();

     }
}
     
