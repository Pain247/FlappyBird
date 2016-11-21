/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleJumping;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author D
 */
public class MyConnect {
    private final String className="com.mysql.jdbc.Driver";
    private final String url="jdbc:mysql://localhost:3306/score";
    private Connection connection;
    private final String user="root";
    private final String pass="0304";
    private String table = "score";
    private int max ;
    private Score scoreM = new Score();
    public void connect(){
        try {
            Class.forName(className);
            connection = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Successful connect");
        } catch (ClassNotFoundException ex) {
            System.out.println("class not found"+ex.toString());
        } catch (SQLException ex) {
            System.out.println("Error connection"+ex.toString()); 
        }

      
    }
    public void insert(Score s){
        String sqlCommand = "insert into score value(?)";
        PreparedStatement pst = null;
        try {
            pst = connection.prepareStatement(sqlCommand);
            pst.setInt(1,s.getPoint());
            if(pst.executeUpdate()>0){
                System.out.println("Successful insert");
            }
            else System.out.println("Insert err");
        } catch (SQLException ex) {
            System.out.println("Insert error "+ex.toString());
        }
    
    }
    public int getMax(){
          
        
            ResultSet rs= null;
            String sqlCommand = "select max(score) from score";
            
        try {
            Statement st = connection.createStatement();
            rs=st.executeQuery(sqlCommand);
           while(rs.next()){
            this.max= rs.getInt(1);
            }
          
        } catch (SQLException ex) {
            System.out.println("Select error \n"+ex.toString());
        }
         return max;
    
    }
    


}
