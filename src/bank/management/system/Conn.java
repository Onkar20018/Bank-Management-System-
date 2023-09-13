// THERE ARE TOTAL FIVE STEPS IN JDBS CONNECTION
//1. Register Driver
//2. Create Connection
//3. Create Statement
//4. Execute Query
//5. Close Connection

package bank.management.system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
       public Conn(){
           try{
                          
              c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","password"); // herewe provide the url of our database name with /// and name of database then username and password
              s= c.createStatement();// this is to create a statement 
              
           }
        catch(Exception e){
           System.out.println(e);
       }
           
       
}
}
