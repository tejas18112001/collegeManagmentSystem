
package college_managment_system;

import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
public class Project extends JFrame implements ActionListener {
    
    Project() {
        
        setSize(1560 , 825) ;
         
          
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg")) ;
        Image i2 = i.getImage().getScaledInstance(1560 , 825, Image.SCALE_DEFAULT) ;
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel img = new JLabel(i3) ;
        add(img)  ;
        
        
        JMenuBar mb = new JMenuBar() ;
        
        // Information
        JMenu menu = new JMenu("New Infomation") ;
        menu.setForeground(Color.red);
        mb.add(menu) ;
        
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information") ;
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this) ;
        menu.add(facultyInfo) ;
        
        JMenuItem studentInfo = new JMenuItem("New student Information") ;
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this) ;
        menu.add(studentInfo) ;
        
        
        // Detail
        JMenu detail = new JMenu("View Detail") ;
        detail.setForeground(Color.blue);
         
        mb.add(detail) ;
        
        
        JMenuItem facultyDetail = new JMenuItem("Faculty Detail") ;
        facultyDetail.setBackground(Color.white);
        facultyDetail.addActionListener(this) ;
        detail.add(facultyDetail) ;
        
        JMenuItem studentDetail = new JMenuItem("Student Detail") ;
        studentDetail.setBackground(Color.white);
        studentDetail.addActionListener(this) ;
        detail.add(studentDetail) ;
        
        //Leave
        
        JMenu leave = new JMenu("Apply Leave") ;
        leave.setForeground(Color.red);
        mb.add(leave) ;
        
        
        JMenuItem facultyLeave = new JMenuItem("Faculty Leave") ;
        facultyLeave.setBackground(Color.white);
        leave.add(facultyLeave) ;
        
        JMenuItem studentLeave = new JMenuItem("Student Leave") ;
        studentLeave.setBackground(Color.white);
        leave.add(studentLeave) ;
        
        // leaveDetail 
        
         JMenu leaveDetail = new JMenu("leaveDetail") ;
        leaveDetail.setForeground(Color.blue);
        mb.add(leaveDetail) ;
        
        
        JMenuItem facultyLeaveDetail= new JMenuItem("Faculty Leave Detail") ;
        facultyLeaveDetail.setBackground(Color.white);
        leaveDetail.add(facultyLeaveDetail) ;
        
        JMenuItem studentLeaveDetail = new JMenuItem("Student LeaveDetail") ;
        studentLeaveDetail.setBackground(Color.white);
        leaveDetail.add(studentLeaveDetail) ;
        
        
        //Examination
         JMenu exam = new JMenu("Examination Results") ;
        exam.setForeground(Color.red);
        mb.add(exam) ;
        
        
        JMenuItem ExaminationDetail= new JMenuItem("Examination Detail") ;
        ExaminationDetail.setBackground(Color.white);
        exam.add(ExaminationDetail) ;
        
        JMenuItem marks = new JMenuItem("Enter Marks") ;
        marks.setBackground(Color.white);
        marks.addActionListener(this) ;
        exam.add(marks) ;
        
        // Update detail
        
        JMenu update = new JMenu("Update Detail") ;
        update.setForeground(Color.blue);
        mb.add(update) ;
        
        
        JMenuItem updateFacultyDetail= new JMenuItem("Update Faculty Detail") ;
        updateFacultyDetail.setBackground(Color.white);
        update.add(updateFacultyDetail) ;
        
        JMenuItem updateStudentDetail = new JMenuItem("Update Student Detail") ;
        updateStudentDetail.setBackground(Color.white);
        update.add(updateStudentDetail) ;
        
        
        
        // fees
        
         JMenu fees = new JMenu("Fees Detail") ;
        fees.setForeground(Color.red);
        mb.add(fees) ;
        
        
        JMenuItem feesStr= new JMenuItem("Fees Structure") ;
        feesStr.setBackground(Color.white);
        fees.add(feesStr) ;
        
        JMenuItem studentFees = new JMenuItem("Student Fees form") ;
        studentFees.setBackground(Color.white);
        fees.add(studentFees) ;
        
        // Utility
        
         JMenu utility = new JMenu("Utility") ;
        utility.setForeground(Color.blue);
        mb.add(utility) ;
        
        
        JMenuItem notepad= new JMenuItem("Notapad") ;
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad) ;
        
        JMenuItem calc = new JMenuItem("Calculator") ;
        calc.setBackground(Color.white);
         calc.addActionListener(this);
        utility.add(calc) ;
        
        
        // exit 
          
        JMenu exit = new JMenu("Exit") ;
        exit.setForeground(Color.blue);
        mb.add(exit) ;
        
        
        JMenuItem exc= new JMenuItem("Exit") ;
        
        exc.setBackground(Color.white);
        exc.addActionListener(this);
        exit.add(exc) ;
        
      
        
        //
      
        setJMenuBar(mb) ;
        
        setVisible(true) ;
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand() ;
        if(msg.equals("Exit")) {
            setVisible(false); 
        }
        else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe") ;
            }catch(Exception er1) {
            }
        }else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad") ;
            }catch(Exception er2) {
            }
        }else if (msg.equals("New student Information")) {
           
               new NewStudent() ;
        }else if (msg.equals("New Faculty Information")) {
           
               new NewTeacher() ;
        }
        
        else if (msg.equals("Student Detail")) {
           
               new StudentDetail() ;
        }
        
        else if (msg.equals("Faculty Detail")) {
           
               new TeacherDetail() ;
        }
        
        else if (msg.equals("Enter Marks")) {
           
               new EnterMarks() ;
        }
        
        
        
        
        
    } 
    
  public static void main(String[] args) {
         new Project();
  }
}
