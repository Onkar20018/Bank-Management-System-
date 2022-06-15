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
                          
              c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Omkar2001#");
              s= c.createStatement();
              
           }
        catch(Exception e){
           System.out.println(e);
       }
           
       
}
}
