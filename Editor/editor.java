
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
        fm = new JFrame();
        fm.setVisible(true);
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

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        JMenu m2 = new JMenu("Edit");
        JMenuItem m4 = new JMenuItem("cut");
        JMenuItem m5 = new JMenuItem("copy");
        JMenuItem m6 = new JMenuItem("past");

        m2.add(m4);
        m2.add(m5);
        m2.add(m6);

        JMenuItem mc = new JMenuItem("close");

        mb.add(m1);
        mb.add(m2);
        mb.add(mc);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    public static void main(String[] args) {
        new editor();
    }
}
