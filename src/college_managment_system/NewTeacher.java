/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package college_managment_system;

import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

import java.util.* ;
import com.toedter.calendar.JDateChooser ;

public class NewTeacher extends JFrame implements ActionListener {
    JDateChooser dateOfBirth ;
    Random ran = new Random() ;
    long randomRoll = Math.abs((ran.nextLong()%9000L) + 1000L) ;
    JTextField nameInput ,fathernameInput ,addressInput ,phonenumberInput ,emailIdInput ,classMarkInput,classMark2Input,aadharIdInput;
    JLabel rollnoInput ;
    JComboBox ccoursesInput , BranchInput ;
    JButton submit  , cancel ;
    NewTeacher() {
        setVisible(true) ;
        
        setLayout(null) ;
        JLabel label = new JLabel("New Teacher Detail") ;
        label.setBounds(300 ,10 , 300 , 50) ;
        label.setBackground(Color.white) ;
        label.setFont(new Font("Tahoma" , Font.BOLD , 20)) ;
        add(label) ;
        
        
        
        JLabel name = new JLabel("Name :") ;
        name.setBounds(30 ,120 ,50 ,20) ;
        name.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(name) ;
        
         nameInput = new JTextField() ;
        nameInput.setBounds(120 ,120 , 200 , 20) ;
        add(nameInput) ;
        
        
        JLabel fathername = new JLabel("Father's Name :") ;
        fathername.setBounds(450 ,120 ,120 ,20) ;
        fathername.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(fathername) ;
        
         fathernameInput = new JTextField() ;
        fathernameInput.setBounds(600,120 , 200 , 20) ;
        add(fathernameInput) ;
        
        
        
        // make difference of 50 in y only
        
        JLabel rollno = new JLabel("Employee Id :") ;
        rollno.setBounds(30 ,170 ,120 ,20) ;
        rollno.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(rollno) ;
        
        rollnoInput = new JLabel("1101" + randomRoll) ;
        rollnoInput.setBounds(140 ,170 , 250 , 25) ;
        rollnoInput.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(rollnoInput) ;
        
        
        JLabel date = new JLabel("Date Of Birth :") ;
        date.setBounds(450 ,170 ,120 ,20) ;
        date.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(date) ;
        
        
        
        dateOfBirth = new JDateChooser( );
        dateOfBirth.setBounds(600,170 , 200 , 20) ;
        add(dateOfBirth) ;
        
        
        //
        
        JLabel address = new JLabel("Address :") ;
        address.setBounds(30 ,220 ,80 ,20) ;
        address.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(address) ;
        
         addressInput = new JTextField() ;
        addressInput.setBounds(120 ,220 , 200 , 20) ;
        add(addressInput) ;
        
        
        JLabel phonenumber = new JLabel("Phone No :") ;
        phonenumber.setBounds(450 ,220 ,120 ,20) ;
        phonenumber.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(phonenumber) ;
        
         phonenumberInput = new JTextField() ;
        phonenumberInput.setBounds(600,220 , 200 , 20) ;
        add(phonenumberInput) ;
        
        
        // 
        
        JLabel emailId = new JLabel("Email ID :") ;
        emailId.setBounds(30 ,270 ,80 ,20) ;
        emailId.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(emailId) ;
        
         emailIdInput = new JTextField() ;
        emailIdInput.setBounds(120 ,270 , 200 , 20) ;
        add(emailIdInput) ;
        
        
        JLabel classMark = new JLabel("Class X % :") ;
        classMark.setBounds(450 ,270 ,120 ,20) ;
        classMark.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(classMark) ;
        
         classMarkInput = new JTextField() ;
        classMarkInput.setBounds(600,270 , 200 , 20) ;
        add(classMarkInput) ;
        
        // 
       
        
        
        JLabel classMark2 = new JLabel("Class XII % :") ;
        classMark2.setBounds(30 ,320 ,150 ,20) ;
        classMark2.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(classMark2) ;
        
         classMark2Input = new JTextField() ;
         
        classMark2Input.setBounds(120 ,320 , 200 , 20) ;
        add(classMark2Input) ;
        
        JLabel aadharId = new JLabel("Aadhar No :") ;
        aadharId.setBounds(450 ,320 ,120 ,20) ;
        aadharId.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(aadharId) ;
        
         aadharIdInput = new JTextField() ;
        aadharIdInput.setBounds(600,320 , 200 , 20) ;
        add(aadharIdInput) ;
        
        
        ///
        
        JLabel course = new JLabel("Education :") ;
        course.setBounds(30 ,370,150 ,20) ;
        course.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(course) ;
        
        String ccourses[] = {"B.Tech" , "BBA" , "M.Tech" ,"B.Sc" , "BA" , "B.Com" , "Art" , "BCA"};
         ccoursesInput = new JComboBox(ccourses) ;
        ccoursesInput.setBounds(120 ,370 , 200 , 20) ;
        add(ccoursesInput) ;
        
        JLabel branch = new JLabel("Department :") ;
        branch.setBounds(450 ,370 ,120 ,20) ;
        branch.setFont(new Font("Tahoma" , Font.PLAIN , 15)) ;
        add(branch) ;
        
         String Branch[] = {"CSE" , "IT" , "EXT" , "Mech" , "Civil" , "Electical" , "AIDS" , "Data Science"};
         BranchInput = new JComboBox(Branch) ;
        BranchInput.setBounds(600,370 , 200 , 20) ;
        add(BranchInput) ;
        
        // Button 
        
        
         submit = new JButton("Submit") ;
        
        submit.setBounds(200,480 , 160 , 30) ;
        submit.setBackground(Color.BLACK) ;
        submit.setForeground(Color.WHITE) ;
        submit.addActionListener(this) ;
        submit.setFont(new Font("Tahoma" , Font.BOLD , 16)) ;
        add(submit) ;
        
         cancel = new JButton("Cancel") ;
        cancel.setBounds(450,480 , 160 , 30) ;
        cancel.setBackground(Color.BLACK) ;
        cancel.setForeground(Color.WHITE) ;
        cancel.addActionListener(this) ;

        cancel.setFont(new Font("Tahoma" , Font.BOLD , 16)) ;
        add(cancel) ;
        
     
        
        
        setLocation(350 , 150) ;
        setSize(850 , 600) ;
        
        
    }
    
    
     
      
      public void actionPerformed(ActionEvent e) {
           if(e.getSource() == submit) {
             
               String sn = nameInput.getText() ;
               String fn = fathernameInput.getText() ;
               String rollno =  rollnoInput.getText();
               String ad = addressInput.getText() ;
               String ph = phonenumberInput.getText() ;
               String em = emailIdInput.getText() ;
               String m1 = classMarkInput.getText() ;
               String m2 = classMark2Input.getText() ;
               String adhar = aadharIdInput.getText() ;
               String Branch =  (String)ccoursesInput.getSelectedItem();
               String Course = (String)ccoursesInput.getSelectedItem() ;
               String dob = ((JTextField)dateOfBirth.getDateEditor().getUiComponent()).getText() ;
               
               
              try{
                  
                 String query = "insert into teacher values('"+sn+"', '"+fn+"', '"+rollno+"', '"+dob+"', '"+ad+"', '"+ph+"', '"+em+"', '"+m1+"', '"+m2+"', '"+adhar+"', '"+Course+"', '"+Branch+"')";
                 Conn c = new Conn() ;
                 c.s.executeUpdate(query) ;
                 JOptionPane.showMessageDialog(null, "New Teacher Detail Inserted Sucessfully");
              } catch(Exception er) {
                  er.printStackTrace();
              }
           
            
           
            
      } else {
               setVisible(false) ;
           }

      }
    public static void main(String[]args) {
        new NewTeacher() ;
    }
}
