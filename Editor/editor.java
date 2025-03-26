
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class editor extends JFrame implements ActionListener{
    
    //Creating a Jtext
    JTextArea txt;
    JFrame fm;
    public editor()
    {
        try {
            UIManager.setLookAndFeel("java.swing.plt.nimbus.NimbusLookAndFeel");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        editor e = new editor();
    }
}
