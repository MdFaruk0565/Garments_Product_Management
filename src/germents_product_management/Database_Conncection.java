
package germents_product_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Database_Conncection {
    Connection con;
    Statement stm;
    PreparedStatement psmt;
    public Database_Conncection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hgl","root","");
            stm = con.createStatement();
            //psmt=con.prepareStatement("");
            
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    
}
