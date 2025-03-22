import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
public class MyFrame extends JFrame{
    public MyFrame()
    {
       
        this.setTitle("JFrame Title"); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
        this.setSize(620,500); 
        

        this.setResizable(true);
        
            
        this.setVisible(true); 
     
        ImageIcon img  = new  ImageIcon("/media/ankit/52EEF87BEEF85925/Learning/Java-Repo/01_Basics/logo.png");
    

        this.setIconImage(img.getImage());
        

        this.getContentPane().setBackground(new Color(0,0,0));
    
    }
}

