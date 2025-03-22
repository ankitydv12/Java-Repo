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
        frame.setSize(420,420); 
        // set x dimnsion and y dimension

        frame.setResizable(false);
        // false => Restrict to resize
        // True => Free to Resize
            
        frame.setVisible(true); 
        // make frame visible 

        ImageIcon img  = new  ImageIcon("logo.png");
        /*
         *    Adding logo to application:
         *      Creat an object(img) of ImageIcon class (javax.swing.ImageIcon)
         *      passing image path as constructor 
         */

        frame.setIconImage(img.getImage());

    }
}