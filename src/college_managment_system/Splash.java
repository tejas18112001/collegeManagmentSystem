///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package college_managment_system;
//
import javax.swing.* ;
import java.awt.* ;
public class Splash extends JFrame implements Runnable{
    Thread t ;
    Splash () {
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg")) ;
        Image i2 = i.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT) ;
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel img = new JLabel(i3) ;
        add(img)  ;
        
        t = new Thread(this) ;
        t.start();
        setVisible(true) ;
        int x  = 1;
        for(int k = 2 ; k <= 600 ; k+=4 , x+=1) {
        setLocation(600 - ((x+k)/2),350 - (k)/2) ;
        setSize(k + 3*x , k + x/2) ;
        
        try {
            Thread.sleep(10);
        }catch(Exception e) {}
         
    }
    }
    
    public void run() {
    try{
       Thread.sleep(7000);
       setVisible(false) ; 
       new Login() ;
    }catch(Exception e) { }
    
   }
            
    public static void main(String args[]) {
       new  Splash() ;
    }
} ;


