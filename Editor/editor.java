
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.classfile.BufWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class editor extends JFrame implements ActionListener{
    
    //Creating a Jtext
    JTextArea txt;
    JFrame fm;

    JButton mc;

    JFileChooser fc;
    public editor()
    {
        fm = new JFrame();
        fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      
         try {
             UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
             MetalLookAndFeel.setCurrentTheme(new OceanTheme());

         } catch (Exception e) {
             e.printStackTrace();
         }

        txt = new JTextArea();
        txt.setFont(new Font("Arial", Font.BOLD, 25));
        txt.setPreferredSize(new Dimension(150,40));
        JMenuBar mb = new JMenuBar();
        mb.setFont(new Font("Arial", Font.BOLD, 25));
        mb.setPreferredSize(new Dimension(150,40));

        JMenu m1 =  new JMenu("File");
        m1.setFont(new Font("Arial", Font.BOLD, 25));

        JMenuItem[] file_iteaamsItem = {
        new JMenuItem("New"),
 
        new JMenuItem("Open"),
        
        new JMenuItem("Save"),
        
        new JMenuItem("Print")
        };

    for(JMenuItem x:file_iteaamsItem)
    {
        x.setFont(new Font("Arial", Font.BOLD, 25));
        x.setPreferredSize(new Dimension(150,40));
        m1.add(x);
        x.addActionListener(this);
    }
    JMenu m2 =  new JMenu("Edit");
    m2.setFont(new Font("Arial", Font.BOLD, 25));
    JMenuItem[] edit_iteaamsItem = {
        new JMenuItem("Cut"),
 
        new JMenuItem("Copy"),
        
        new JMenuItem("Past"),
        
        };

    for(JMenuItem x:edit_iteaamsItem)
    {
        x.setFont(new Font("Arial", Font.BOLD, 25));
        x.setPreferredSize(new Dimension(150,40));
        m2.add(x);
        x.addActionListener(this);
    }

        mc = new JButton("close");
        mc.setFont(new Font("Arial", Font.BOLD, 25));
        mc.addActionListener(this);
       

        mb.add(m1);
        mb.add(m2);
        mb.add(mc);
        

        fm.setJMenuBar(mb);
        fm.setSize(1200,800);
        fm.setResizable(true);
        fm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fm.add(txt);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    String cm = e.getActionCommand();
    System.out.println(cm);

    if(cm.equals("New"))
        newwindow();
    else if(cm.equals("Open"))
    {
        fc.setMultiSelectionEnabled(false);
        fc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only text file ", "txt");
        fc.addChoosableFileFilter(restrict);
        int res = fc.showOpenDialog(null);
        if(res==JFileChooser.APPROVE_OPTION)
        {
            File file = new File(fc.getSelectedFile().getAbsolutePath());
            try {
                String s1 = "", sl = "";
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                sl = br.readLine();
                while((s1 = br.readLine())!=null)
                {
                    sl = sl + "\n" + s1;
                }
                txt.setText(sl);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(fm, ex.getMessage());
            }
        }

    }
    else if(cm.equals("Save"))
    {
        File file = new File(fc.getSelectedFile().getAbsolutePath());
        BufWriter bw = new BufWriter(file);
    }


        
    }
    public void newwindow()
    {
        SwingUtilities.invokeLater(()-> new editor());
    }
    public static void main(String[] args) {
       new editor();
    }
}
