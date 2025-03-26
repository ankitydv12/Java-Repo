
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class editor extends JFrame implements ActionListener{
    
    //Creating a Jtext
    JTextArea txt;
    JFrame fm;
    public editor()
    {
        this.
        try {
            UIManager.setLookAndFeel("java.swing.plt.nimbus.NimbusLookAndFeel");
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());

        } catch (Exception e) {
            e.printStackTrace();
        }

        txt = new JTextArea();
        JMenuBar mb = new JMenuBar();

        JMenu m1 =  new JMenu("File");

        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");
        JMenuItem mi4 = new JMenuItem("Print");

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        mi1.add(mi1);
        mi2.add(mi2);
        mi3.add(mi3);
        mi4.add(mi4);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    public static void main(String[] args) {
        editor e = new editor();
    }
}
