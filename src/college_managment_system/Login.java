/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college_managment_system;


import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
import java.sql.* ;
public class Login extends JFrame implements ActionListener {
    
    JButton user  ;
    JButton cancel ;
    JTextField txusername,  userpassword ;
    
    Login()  {
         
        getContentPane().setBackground(Color.WHITE );
        
        
        setLayout(null) ;
        JLabel username = new JLabel("Username") ;
        username.setBounds(40 ,20 , 100 , 20) ;
        add(username) ;
        
        txusername = new JTextField() ;
        txusername.setBounds(160 ,20 , 150 , 20) ;
        add(txusername) ;
        
        
        JLabel password = new JLabel("Password") ;
        password.setBounds(40 ,70 , 100 , 20) ;
        add(password) ;
        
         userpassword = new JPasswordField() ;
        userpassword.setBounds(160 ,70 , 150 , 20) ;
        add(userpassword) ;
        
        
        
        user = new JButton("Login") ;
        user.setBounds(40 , 140 , 160 , 30) ;
        user.setBackground(Color.BLACK) ;
        user.setForeground(Color.WHITE) ;
        user.addActionListener(this) ;
        user.setFont(new Font("Tahoma" , Font.BOLD , 16)) ;
        add(user) ;
        
        cancel = new JButton("cancel") ;
        cancel.setBounds(220 , 140 , 160 , 30) ;
        cancel.setBackground(Color.BLACK) ;
        cancel.setForeground(Color.WHITE) ;
        cancel.addActionListener(this) ;

        cancel.setFont(new Font("Tahoma" , Font.BOLD , 16)) ;
        add(cancel) ;
        
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg")) ;
        Image i2 = i.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT) ;
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel img = new JLabel(i3) ;
        img.setBounds(380, 0 , 200 , 200) ;
        add(img)  ;
        
        setVisible(true) ;
        setSize(600 , 300) ;
        setLocation(500 , 250) ;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == user) {
            String username  = txusername.getText();
            String Pass = userpassword.getText() ;
            
            try {
            
            String query = "select * from login where username='"+username+"' and password='"+Pass+"'" ;
            Conn c = new Conn() ;
            ResultSet rs = c.s.executeQuery(query) ;
            if(rs.next()) {
                setVisible(false) ;
                new Project() ;
            }else {
                JOptionPane.showMessageDialog(null, "Invalide username or password");
                setVisible(false) ;
            }
              c.s.close() ;
            }catch(Exception er) {
                er.printStackTrace();
            }
           
            
        }else if(e.getSource() == cancel) {
            setVisible(false) ;
        }
    } 
        
    public static void main(String[]args) {
         new Login() ;
    }
}
