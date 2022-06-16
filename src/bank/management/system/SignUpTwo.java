// HERE WE ARE CREATING A SIGN UP PAGE TO TAKE INFO FROMM THE USER
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignUpTwo extends JFrame implements ActionListener{
      
      
      JTextField nameTextField, pan,aadhar,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;// To Take all the Inputs from User 
      JButton  next; // Creating Button 
      JRadioButton yes,no,eyes,eno ; // This is for Selection button which has categories
      JComboBox religion,category,occupation,education ,income;
      String formno;
    SignUpTwo(String formno){
                  this.formno= formno;
                  setTitle("Sign UP 2");             
                  setLayout(null);
              
                 
                  // This is for Additional Details Heading 
                 JLabel additionalDetails= new JLabel("Page 2: Additional Details");
                  additionalDetails.setFont(new Font("Arial",Font.BOLD,22));
                  additionalDetails.setBounds(290,80,400,30);
                  add(additionalDetails);
                  
                  // This is for Religion
                 JLabel name= new JLabel("Religion:");
                  name.setFont(new Font("Arial",Font.BOLD,20));
                  name.setBounds(100,140,100,30);
                  add(name);
                   
                 String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
                   religion = new JComboBox(valReligion); 
                  religion.setBounds(300,140,400,30);
                  add(religion);
                  
                 
                  
                  // This is for Category
                 JLabel fname= new JLabel("Category:");
                  fname.setFont(new Font("Arial",Font.BOLD,20));
                  fname.setBounds(100,190,200,30);
                  add(fname);
                  
                  String cat[] = {"General","OBC","SC","ST","Other"}; 
                 category = new JComboBox(cat);
                  category.setFont(new Font("Arial",Font.BOLD,14));
                  category.setBounds(300,190,400,30);
                  add(category);
                  
                  // This is for  Income
                 JLabel dob= new JLabel("Income:");
                  dob.setFont(new Font("Arial",Font.BOLD,20));
                  dob.setBounds(100,240,200,30);
                  add(dob);
         
                  String inc[] = {"Null","< 1,50,000","< 2,50,000","<5,00,000","UpTo 10,00,000"}; 
                   income = new JComboBox(inc);
                  income.setFont(new Font("Arial",Font.BOLD,14));
                  income.setBounds(300,240,400,30);
                  add(income);
                  
                  // This is for Educational Qualification Written Seprately
                 JLabel gender= new JLabel("Education:");
                  gender.setFont(new Font("Arial",Font.BOLD,20));
                  gender.setBounds(100,290,200,30);
                  add(gender);
              
                  JLabel email= new JLabel("Qualification:");
                  email.setFont(new Font("Arial",Font.BOLD,20));
                  email.setBounds(100,315,200,30);
                  add(email);
                  
                  String ed[] = {"Non Graduation","Graduate","Post Graduation","Doctrate","Others"}; 
                   education = new JComboBox(ed);
                  education.setFont(new Font("Arial",Font.BOLD,14));
                  education.setBounds(300,315,400,30);
                  add(education);
                  
                 // This is for Occupation
                  JLabel marital= new JLabel("Occupation:");
                  marital.setFont(new Font("Arial",Font.BOLD,20));
                  marital.setBounds(100,390,200,30);
                  add(marital);
                 
                   String oc[] = {"Salaried","Self Employed","Business","Student","Retired","Others"}; 
                   occupation = new JComboBox(oc);
                  occupation.setFont(new Font("Arial",Font.BOLD,14));
                  occupation.setBounds(300,390,400,30);
                  add(occupation);
                  
                  
                  // This is for Pan No
                  JLabel address= new JLabel("PAN NO:");
                  address.setFont(new Font("Arial",Font.BOLD,20));
                  address.setBounds(100,440,200,30);
                  add(address);
                 
                  pan = new JTextField();  // To Take input
                  pan.setFont(new Font("Arial",Font.BOLD,14));
                  pan.setBounds(300,440,400,30);
                  add(pan);
                   // This is for AAdhar
                 JLabel city= new JLabel("Aadhar NO:");
                  city.setFont(new Font("Arial",Font.BOLD,20));
                  city.setBounds(100,490,200,30);
                  add(city);
                  
                  aadhar = new JTextField(); // To Take input 
                  aadhar.setFont(new Font("Arial",Font.BOLD,14));
                  aadhar.setBounds(300,490,400,30);
                  add(aadhar);
                  
                  // This is for Senior Citizen
                  JLabel state= new JLabel("Senior Citizen:");
                  state.setFont(new Font("Arial",Font.BOLD,20));
                  state.setBounds(100,540,200,30);
                  add(state);
                  
                   yes = new JRadioButton("Yes"); // To Take input
                  yes.setBounds(300,540,60, 30);
                  yes.setBackground(Color.YELLOW);
                  add(yes);
                  no = new JRadioButton("NO"); // To Take input
                  no.setBounds(450,540,70,30);
                  no.setBackground(Color.YELLOW);
                  add(no);
                  // We created male and female but since only one can be selcted a time We have to  make a group of it .
                  ButtonGroup gendergroup = new ButtonGroup(); // Button group is created 
                  gendergroup.add(yes);// We add all the the categories in a GRoup so that  only one can be selcted from the group at a Tine
                  gendergroup.add(no);
                  
                
                  
                  // This is for PinCode
                  JLabel pincode= new JLabel("Existing Account:");
                  pincode.setFont(new Font("Arial",Font.BOLD,20));
                  pincode.setBounds(100,590,200,30);
                  add(pincode);
                  
                  eyes = new JRadioButton("Yes"); // To Take input
                  eyes.setBounds(300,590,60, 30);
                  eyes.setBackground(Color.YELLOW);
                  add(eyes);
                  eno = new JRadioButton("NO"); // To Take input
                  eno.setBounds(450,590,70,30);
                  eno.setBackground(Color.YELLOW);
                  add(eno);
                  // We created male and female but since only one can be selcted a time We have to  make a group of it .
                  gendergroup = new ButtonGroup(); // Button group is created 
                  gendergroup.add(eyes);// We add all the the categories in a GRoup so that  only one can be selcted from the group at a Tine
                  gendergroup.add(eno);
                  
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
                             // Converting Long random to string
                            String sreligion =  (String) religion.getSelectedItem();
                            String scategory = (String) category.getSelectedItem();
                            String sincome = (String) income.getSelectedItem();
                            String seducation = (String) education.getSelectedItem();
                            String soccupation = (String) occupation.getSelectedItem();
                            String seniorcitizen = null;
                            if(yes.isSelected()){
                                seniorcitizen = "Yes";
                            }else if (no.isSelected()){
                                seniorcitizen = "NO";
                            }
                           
                            String existingaccount = null;
                            if(eyes.isSelected()){
                                existingaccount = "Yes";
                            }else if(eno.isSelected()){
                                      existingaccount = "No";
                            }
                            
                            String span =  pan.getText();
                            String saadhar = aadhar.getText();
                          
                             // Below try catch is to catch error since we are dealing with Mysql so error may occcur at Runtime which is needed to be cacthced
                            try{
                                {
                                     
                                     Conn c = new Conn(); // We create a Object of Conn class where JDBC connection is established and Constructor is Called 
                                     // Below we will be running a query to pass all the values taken from the user to the Database in My sql
 String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                                     c.s.executeUpdate(query); // This is to selct the query and pass it to Database. using object of class Conn(c) and using s from Conn
                  
                                          // Signup3 Object 
                                          setVisible(false);
                                          new SignUpThree(formno).setVisible(true);
                                }
                                 
                              
                     }
                            catch(Exception e){
                                System.out.println(e);
                            }
                     }
    public static void main(String args[]){    
           new SignUpTwo("");
    }
}
