
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignUpOne extends JFrame implements ActionListener{
      
      long random;
      JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
      JButton  next;
      JRadioButton male,female,married,unmarried,other ;
      JDateChooser datechooser; 
    SignUpOne(){
                  
                  setTitle("Sign UP");             
                  setLayout(null);
                 
                  // This is TO GEnerate Random number given to the application;
                  Random ran = new Random();
                 random = (Math.abs((ran.nextLong() %9000L)+1000L));
  
                 // This is for First Label
                 JLabel formno= new JLabel("Application Form No. "+ random);
                  formno.setFont(new Font("Arial",Font.BOLD,38));
                  formno.setBounds(140,20,600,40);
                  add(formno);
                 
                  // This is for Personal Details
                 JLabel personalDetails= new JLabel("Page 1: Personal Details");
                  personalDetails.setFont(new Font("Arial",Font.BOLD,22));
                  personalDetails.setBounds(290,80,400,30);
                  add(personalDetails);
                  
                  // This is for Name
                 JLabel name= new JLabel("Name:");
                  name.setFont(new Font("Arial",Font.BOLD,20));
                  name.setBounds(100,140,100,30);
                  add(name);
                  
                  nameTextField = new JTextField();
                  nameTextField.setFont(new Font("Arial",Font.BOLD,14));
                  nameTextField.setBounds(300,140,400,30);
                  add(nameTextField);
                  // This is for FName
                 JLabel fname= new JLabel("Father's Name:");
                  fname.setFont(new Font("Arial",Font.BOLD,20));
                  fname.setBounds(100,190,200,30);
                  add(fname);
                  
                  fnameTextField = new JTextField();
                  fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
                  fnameTextField.setBounds(300,190,400,30);
                  add(fnameTextField);
                  // This is for DOB
                 JLabel dob= new JLabel("Date Of Birth:");
                  dob.setFont(new Font("Arial",Font.BOLD,20));
                  dob.setBounds(100,240,200,30);
                  add(dob);
         
                  datechooser = new JDateChooser();
                  datechooser.setBounds(300,240,420,30);
                  add(datechooser);
                  
                  // This is for Gender
                 JLabel gender= new JLabel("Gender:");
                  gender.setFont(new Font("Arial",Font.BOLD,20));
                  gender.setBounds(100,290,200,30);
                  add(gender);
                  
                   male = new JRadioButton("Male");
                  male.setBounds(300,290,60, 30);
                  male.setBackground(Color.YELLOW);
                  add(male);
                   female = new JRadioButton("Female");
                  female.setBounds(450,290,70,30);
                  female.setBackground(Color.YELLOW);
                  add(female);
                  
                  ButtonGroup gendergroup = new ButtonGroup();
                  gendergroup.add(male);
                  gendergroup.add(female);
                  
                 // This is for Email
                 JLabel email= new JLabel("Email Address:");
                  email.setFont(new Font("Arial",Font.BOLD,20));
                  email.setBounds(100,340,200,30);
                  add(email);
                  
                  emailTextField = new JTextField();
                  emailTextField.setFont(new Font("Arial",Font.BOLD,14));
                  emailTextField.setBounds(300,340,400,30);
                  add(emailTextField);
                  
                 // This is for Marital Status
                 JLabel marital= new JLabel("Marital Status:");
                  marital.setFont(new Font("Arial",Font.BOLD,20));
                  marital.setBounds(100,390,200,30);
                  add(marital);
                  
                   married = new JRadioButton("Married");
                  married.setBounds(300,390,150, 30);
                  married.setBackground(Color.YELLOW);
                  add(married);
                  
                   unmarried = new JRadioButton("UnMarried");
                  unmarried.setBounds(450,390,150,30);
                  unmarried.setBackground(Color.YELLOW);
                  add(unmarried);
                  
                   other = new JRadioButton("Other");
                  other.setBounds(600,390,150,30);
                  other.setBackground(Color.YELLOW);
                  add(other);
                  
                  ButtonGroup maritalgroup = new ButtonGroup();
                  maritalgroup.add(married);
                  maritalgroup.add(unmarried);
                  maritalgroup.add(other);
                  
                  
                  // This is for Address
                 JLabel address= new JLabel("Address:");
                  address.setFont(new Font("Arial",Font.BOLD,20));
                  address.setBounds(100,440,200,30);
                  add(address);
                 
                  addressTextField = new JTextField();
                  addressTextField.setFont(new Font("Arial",Font.BOLD,14));
                  addressTextField.setBounds(300,440,400,30);
                  add(addressTextField);
                   // This is for City
                 JLabel city= new JLabel("City:");
                  city.setFont(new Font("Arial",Font.BOLD,20));
                  city.setBounds(100,490,200,30);
                  add(city);
                  
                  cityTextField = new JTextField();
                  cityTextField.setFont(new Font("Arial",Font.BOLD,14));
                  cityTextField.setBounds(300,490,400,30);
                  add(cityTextField);
                  // This is for State
                 JLabel state= new JLabel("State:");
                  state.setFont(new Font("Arial",Font.BOLD,20));
                  state.setBounds(100,540,200,30);
                  add(state);
                  
                  stateTextField = new JTextField();
                  stateTextField.setFont(new Font("Arial",Font.BOLD,14));
                  stateTextField.setBounds(300,540,400,30);
                  add(stateTextField);
                  
                  // This is for PinCode
                 JLabel pincode= new JLabel("PinCode:");
                  pincode.setFont(new Font("Arial",Font.BOLD,20));
                  pincode.setBounds(100,590,200,30);
                  add(pincode);
                  
                  pincodeTextField = new JTextField();
                  pincodeTextField.setFont(new Font("Arial",Font.BOLD,14));
                  pincodeTextField.setBounds(300,590,400,30);
                  add(pincodeTextField);
                  
                   next = new JButton("Next");
                  next.setBounds(610,700,80,40);
                  next.setBackground(Color.BLACK);
                  next.setForeground(Color.WHITE);
                  next.addActionListener(this);
                  add(next);
                  
                  getContentPane().setBackground(Color.YELLOW);
                  
                  setSize(800,850);
                  setLocation(350,10);
                  setVisible(true);
              }   
     
                     public void actionPerformed(ActionEvent ae){
                            String formno = "" + random; // Converting Long random to string
                            String name = nameTextField.getText();
                            String fname = fnameTextField.getText();
                            String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
                            String gender = null;
                            if(male.isSelected()){
                                gender = "Male";
                            }else if (female.isSelected()){
                                gender = "Female";
                            }
                            String email = emailTextField.getText();
                            String marital = null;
                            if(married.isSelected()){
                                marital = "Married";
                            }else if(unmarried.isSelected()){
                                      marital = "UnMarried";
                            }else if (other.isSelected()){
                                marital = "Other";
                            }
                            
                            String  address =  addressTextField.getText();
                            String city = cityTextField.getText();
                            String state = stateTextField.getText();
                            String pin = pincodeTextField.getText();
                             
                            try{
                                 if(name.equals("")){
                                     JOptionPane.showMessageDialog(null,"Name is Required");
                                 } else if(fname.equals("")){
                                     JOptionPane.showMessageDialog(null,"Father's Name is Required");
                                 }else 
                                 if(email.equals("")){
                                     JOptionPane.showMessageDialog(null,"Email is Required");
                                 }else if(address.equals("")){
                                     JOptionPane.showMessageDialog(null,"Address is Required");
                                 }else if(city.equals("")){
                                     JOptionPane.showMessageDialog(null,"City is Required");
                                 }else if(state.equals("")){
                                     JOptionPane.showMessageDialog(null,"State is Required");
                                 }else if(pin.equals("")){
                                     JOptionPane.showMessageDialog(null,"PinCode is Required");
                                 }else{
                                     Conn c = new Conn();
                                     String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                                     c.s.executeUpdate(query);
                                 }
                                 
                                
                     }
                            catch(Exception e){
                                System.out.println(e);
                            }
                     }
    public static void main(String args[]){    
           new SignUpOne();
    }
}
