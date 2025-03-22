import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame01 {
    public static void main(String[] args) 
    {
        // JFrame = a GUI window to add component 
        JFrame frame = new JFrame();

        
        frame.setTitle("JFrame Title"); 
        // seting title of frame


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        /*
         * JFrame.exit_on_close => hide the application but it running in background
         * JFrame.do_nothing  => application will not close on clicking x buttion
         * DISPOSE_ON_CLOSE => Hide the window and close the operation
         *  DISPOSE_ON_CLOSE => The dispose-window default window close operation.
         */
        frame.setSize(620,500); 
        // set x dimnsion and y dimension

        frame.setResizable(true);
        // false => Restrict to resize
        // True => Free to Resize
            
        frame.setVisible(true); 
        // make frame visible 

        ImageIcon img  = new  ImageIcon("logo.png");
        System.out.println(img.getImage());
        /*
         *    Adding logo to application:
         *      Creat an object(img) of ImageIcon class (javax.swing.ImageIcon)
         *      passing image path as constructor 
         */

        frame.setIconImage(img.getImage());
        // set the image as logo (not working)

        frame.getContentPane().setBackground(new Color(25,43,23));
        /*
         * contentPane:
         *      is primary container in JFrame
         *      Top level window which contain buttons , labels , panel
         *      By default use BorderLayout 
         * setBackground(Color.RED)
         * setBackground(new Color(r,b,g))
         * setBackground(new Color(0xFFFFFF))=> hexadecimal color value
         */
    }
}