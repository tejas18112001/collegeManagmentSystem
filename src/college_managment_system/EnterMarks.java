
package college_managment_system;
import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EnterMarks extends JFrame  implements ActionListener{
    Choice crollno ;
    JComboBox semisterBox ;
    JTextField sub1 , sub2, sub3 , sub4 , sub5 , mrk1 , mrk2 , mrk3 , mrk4 , mrk5 ;
    JButton submit , cancel ;
    EnterMarks() {
        
        setSize(1000 , 500) ;
        setLocation(300 ,150) ;
        setLayout(null) ;
        getContentPane().setBackground(Color.white) ;
        
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg")) ;
        Image i2 = i.getImage().getScaledInstance(400 , 300, Image.SCALE_DEFAULT) ;
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel img = new JLabel(i3) ;
        img.setBounds(500 , 40 ,400 ,300) ;
        add(img)  ;
        
        JLabel label = new JLabel("Enter Marks Of Student") ;
        label.setBounds(30,0 , 200 , 50) ;
        label.setBackground(Color.white) ;
        label.setFont(new Font("Tahoma" , Font.BOLD , 20)) ;
        add(label) ;
        
        
        
        JLabel name = new JLabel("Select Roll No. :") ;
        name.setBounds(30 ,70 ,150 ,20) ;
        name.setFont(new Font("Tahoma" , Font.PLAIN , 16)) ;
        add(name) ;
        
        crollno = new Choice();
        crollno.setBounds(200 ,70 ,200 ,20);
        add(crollno);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        JLabel semester = new JLabel("Select Semister:") ;
        semester.setBounds(30 ,100 ,150 ,20) ;
        semester.setFont(new Font("Tahoma" , Font.PLAIN , 16)) ;
        add(semester) ;
        
        
        String Sem [] = {"1st Sem" , "2nd Sem" , "3rd Sem" , "4rth Sem" , "5th Sem" , "6th Sem"  ,"7th Sem" , "8th Sem"} ;
        semisterBox = new JComboBox(Sem) ;
        semisterBox.setBounds(200 ,100 ,150 ,20) ;
        semisterBox.setBackground(Color.white) ;
        add(semisterBox) ;
        
        
        JLabel subject = new JLabel("Enter Subject") ;
        subject.setBounds(80 ,150 ,150 ,20) ;
        subject.setFont(new Font("Tahoma" , Font.PLAIN , 16)) ;
        add(subject) ;
        
        JLabel marks = new JLabel("Enter Marks") ;
        marks.setBounds(250 ,150 ,150 ,20) ;
        marks.setFont(new Font("Tahoma" , Font.PLAIN , 16)) ;
        add(marks) ;
        
        
        
        
        sub1 =  new JTextField() ;
        sub1.setBounds(50 ,180 ,150 ,20);
        add(sub1) ;
        
        
        sub2 =  new JTextField() ;
        sub2.setBounds(50 ,210 ,150 ,20);
        add(sub2) ;
        
        sub3 =  new JTextField() ;
        sub3.setBounds(50 ,240 ,150 ,20);
        add(sub3) ;
        
        sub4 =  new JTextField() ;
        sub4.setBounds(50 ,270 ,150 ,20);
        add(sub4) ;
        
        sub5 =  new JTextField() ;
        sub5.setBounds(50 ,300 ,150 ,20);
        add(sub5) ;
        
        
        
        mrk1=  new JTextField() ;
        mrk1.setBounds(200 ,180 ,150 ,20);
        add(mrk1) ;
        
         mrk2=  new JTextField() ;
        mrk2.setBounds(200 ,210 ,150 ,20);
        add(mrk2) ;
        
         mrk3=  new JTextField() ;
        mrk3.setBounds(200 ,240 ,150 ,20);
        add(mrk3) ;
        
         mrk4=  new JTextField() ;
        mrk4.setBounds(200 ,270 ,150 ,20);
        add(mrk4) ;
        
         mrk5=  new JTextField() ;
        mrk5.setBounds(200 ,300 ,150 ,20);
        add(mrk5) ;
        
        
        
        
         
         submit = new JButton("Submit") ;
        
        submit.setBounds(110 ,350 ,150 ,30) ;
        submit.setBackground(Color.BLACK) ;
        submit.setForeground(Color.WHITE) ;
        submit.addActionListener(this) ;
        submit.setFont(new Font("Tahoma" , Font.BOLD , 16)) ;
        add(submit) ;
        
        cancel = new JButton("Back") ;
        cancel.setBounds(280,350 ,150 ,30) ;
        cancel.setBackground(Color.BLACK) ;
        cancel.setForeground(Color.WHITE) ;
        cancel.addActionListener(this) ;
        cancel.setFont(new Font("Tahoma" , Font.BOLD , 16)) ;
        add(cancel) ;
        
        setVisible(true) ;
        
        
        
    }
    
      public void actionPerformed(ActionEvent er) {
          
          String rollno ;
          rollno = crollno.getSelectedItem();
          String sem = (String)semisterBox.getSelectedItem() ;
          
          String s1  = sub1.getText() ;
          String s2  = sub2.getText() ;
          String s3  = sub3.getText() ;
          String s4  = sub4.getText() ;
          String s5  = sub5.getText() ;
          
          
          String m1 = mrk1.getText() ;
          String m2 = mrk2.getText() ;
          String m3 = mrk3.getText() ;
          String m4 = mrk4.getText() ;
          String m5 = mrk5.getText() ;
          
          if(er.getSource() == submit) {
              try{
                   
                  
                 
                 String query1 = "insert into subject values('"+rollno+"', '"+sem+"', '"+s1+"', '"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"')";
                 String query2 = "insert into marks values('"+rollno+"', '"+sem+"', '"+m1+"', '"+m2+"', '"+m3+"', '"+m4+"', '"+m5+"')";
                 Conn c = new Conn() ;
                 c.s.executeUpdate(query1) ;
//                 JOptionPane.showMessageDialog(null, "Subject  Inserted Sucessfully");
                 c.s.executeUpdate(query2) ;
                 
                 JOptionPane.showMessageDialog(null, "Subject and Marks  Inserted Sucessfully");
               
              }catch(Exception e) {
                  e.printStackTrace();
              }
          }else {
              setVisible(false) ;
          }
      }
      
      
      
    public static void main(String[] args) {
        new EnterMarks() ;
    }
}
