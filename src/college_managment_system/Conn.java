
package college_managment_system;
import java.sql.* ;
public class Conn {
    Connection c ;
    Statement s ;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagmentsystem" , "root" , "Tejas@123") ;
            s = c.createStatement() ;
        }catch(Exception e) {
            e.printStackTrace() ;
        }
    }
    
    
    public static void main(String[] args) {
        new Conn() ;
    }
}
