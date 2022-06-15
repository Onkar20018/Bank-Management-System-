// HERE WE ARE CREATING A SIGN UP PAGE TO TAKE INFO FROMM THE USER
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignUpOne extends JFrame implements ActionListener{
      
      long random; // To generate Random Numbers
      JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;// To Take all the Inputs from User 
      JButton  next; // Creating Button 
      JRadioButton male,female,married,unmarried,other ; // This is for Selection button which has categories
      JDateChooser datechooser; // To make date slector widnows appear is in Jar file Calendar
    SignUpOne(){
                  
                  setTitle("Sign UP");             
                  setLayout(null);
                 
                  // This is TO GEnerate Random number given to the application;
                  Random ran = new Random();
                 random = (Math.abs((ran.nextLong() %9000L)+1000L));
  
                 // This is for First Label
                 JLabel formno= new JLabel("Application Form No. "+ random); // Appears random form no on Top 
                  formno.setFont(new Font("Arial",Font.BOLD,38));
                  formno.setBounds(140,20,600,40);
                  add(formno);
                 
                  // This is for Personal Details Heading 
                 JLabel personalDetails= new JLabel("Page 1: Personal Details");
                  personalDetails.setFont(new Font("Arial",Font.BOLD,22));
                  personalDetails.setBounds(290,80,400,30);
                  add(personalDetails);
                  
                  // This is for Name
                 JLabel name= new JLabel("Name:");
                  name.setFont(new Font("Arial",Font.BOLD,20));
                  name.setBounds(100,140,100,30);
                  add(name);
                  
                  nameTextField = new JTextField(); // To Take input 
                  nameTextField.setFont(new Font("Arial",Font.BOLD,14));
                  nameTextField.setBounds(300,140,400,30);
                  add(nameTextField);
                  
                  // This is for FName
                 JLabel fname= new JLabel("Father's Name:");
                  fname.setFont(new Font("Arial",Font.BOLD,20));
                  fname.setBounds(100,190,200,30);
                  add(fname);
                  
                  fnameTextField = new JTextField();   // To Take input
                  fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
                  fnameTextField.setBounds(300,190,400,30);
                  add(fnameTextField);
                  
                  // This is for DOB
                 JLabel dob= new JLabel("Date Of Birth:");
                  dob.setFont(new Font("Arial",Font.BOLD,20));
                  dob.setBounds(100,240,200,30);
                  add(dob);
         
                  datechooser = new JDateChooser();  // To Take input
                  datechooser.setBounds(300,240,420,30);
                  add(datechooser);
                  
                  // This is for Gender
                 JLabel gender= new JLabel("Gender:");
                  gender.setFont(new Font("Arial",Font.BOLD,20));
                  gender.setBounds(100,290,200,30);
                  add(gender);
                  
                  male = new JRadioButton("Male"); // To Take input
                  male.setBounds(300,290,60, 30);
                  male.setBackground(Color.YELLOW);
                  add(male);
                  female = new JRadioButton("Female"); // To Take input
                  female.setBounds(450,290,70,30);
                  female.setBackground(Color.YELLOW);
                  add(female);
                  // We created male and female but since only one can be selcted a time We have to  make a group of it .
                  ButtonGroup gendergroup = new ButtonGroup(); // Button group is created 
                  gendergroup.add(male);// We add all the the categories in a GRoup so that  only one can be selcted from the group at a Tine
                  gendergroup.add(female);
                  
                 // This is for Email
                  JLabel email= new JLabel("Email Address:");
                  email.setFont(new Font("Arial",Font.BOLD,20));
                  email.setBounds(100,340,200,30);
                  add(email);
                  
                  emailTextField = new JTextField();  // To Take input
                  emailTextField.setFont(new Font("Arial",Font.BOLD,14));
                  emailTextField.setBounds(300,340,400,30);
                  add(emailTextField);
                  
                 // This is for Marital Status
                  JLabel marital= new JLabel("Marital Status:");
                  marital.setFont(new Font("Arial",Font.BOLD,20));
                  marital.setBounds(100,390,200,30);
                  add(marital);
                  
                  married = new JRadioButton("Married"); // To Take input
                  married.setBounds(300,390,150, 30);
                  married.setBackground(Color.YELLOW);
                  add(married);
                  
                   unmarried = new JRadioButton("UnMarried"); // To Take input
                  unmarried.setBounds(450,390,150,30);
                  unmarried.setBackground(Color.YELLOW);
                  add(unmarried);
                  
                   other = new JRadioButton("Other"); // To Take input
                  other.setBounds(600,390,150,30);
                  other.setBackground(Color.YELLOW);
                  add(other);
                  
                  ButtonGroup maritalgroup = new ButtonGroup(); // Again to  Create a group 
                  maritalgroup.add(married);
                  maritalgroup.add(unmarried);
                  maritalgroup.add(other);
                  
                  
                  // This is for Address
                 JLabel address= new JLabel("Address:");
                  address.setFont(new Font("Arial",Font.BOLD,20));
                  address.setBounds(100,440,200,30);
                  add(address);
                 
                  addressTextField = new JTextField();  // To Take input
                  addressTextField.setFont(new Font("Arial",Font.BOLD,14));
                  addressTextField.setBounds(300,440,400,30);
                  add(addressTextField);
                   // This is for City
                 JLabel city= new JLabel("City:");
                  city.setFont(new Font("Arial",Font.BOLD,20));
                  city.setBounds(100,490,200,30);
                  add(city);
                  
                  cityTextField = new JTextField(); // To Take input 
                  cityTextField.setFont(new Font("Arial",Font.BOLD,14));
                  cityTextField.setBounds(300,490,400,30);
                  add(cityTextField);
                  
                  // This is for State
                  JLabel state= new JLabel("State:");
                  state.setFont(new Font("Arial",Font.BOLD,20));
                  state.setBounds(100,540,200,30);
                  add(state);
                  
                  stateTextField = new JTextField(); // To Take input
                  stateTextField.setFont(new Font("Arial",Font.BOLD,14));
                  stateTextField.setBounds(300,540,400,30);
                  add(stateTextField);
                  
                  // This is for PinCode
                  JLabel pincode= new JLabel("PinCode:");
                  pincode.setFont(new Font("Arial",Font.BOLD,20));
                  pincode.setBounds(100,590,200,30);
                  add(pincode);
                  
                  pincodeTextField = new JTextField(); // To Take input
                  pincodeTextField.setFont(new Font("Arial",Font.BOLD,14));
                  pincodeTextField.setBounds(300,590,400,30);
                  add(pincodeTextField);
                  
                  next = new JButton("Next"); // Button to fill the form after details are DOne filing 
                  next.setBounds(610,700,80,40);
                  next.setBackground(Color.BLACK);
                  next.setForeground(Color.WHITE);
                  next.addActionListener(this);
                  add(next);
                  
                  getContentPane().setBackground(Color.YELLOW);  /// To edit background
                  
                  setSize(800,850);
                  setLocation(350,10);
                  setVisible(true);
              }   
     
                     public void actionPerformed(ActionEvent ae){ // We are using ActionListner Interface
                         // Now every Input is to be taken from form and to be saved in Variable String 
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
                             // Below try catch is to catch error since we are dealing with Mysql so error may occcur at Runtime which is needed to be cacthced
                            try{
                                // To take evryinpput if anything is empty a Dialougue box will appear
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
                                     
                                     Conn c = new Conn(); // We create a Object of Conn class where JDBC connection is established and Constructor is Called 
                                     
                                    // Below we will be running a query to pass all the values taken from the user to the Database in My sql
                                     String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                                    
                                     c.s.executeUpdate(query); // This is to selct the query and pass it to Database. using object of class Conn(c) and using s from Conn
                                     
                                     setVisible(false);
                                     new SignUpTwo(formno).setVisible(true);
                                     
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
