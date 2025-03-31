package Learn;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

import javax.swing.filechooser.FileSystemView;

public class openand extends JFrame implements ActionListener {
    static JLabel l;
    public openand()
    {

    }
public static void main(String[] args) {
    JFrame fm = new JFrame();
    fm.setVisible(true);
    fm.setLocationRelativeTo(null);
    fm.setSize(800,800);
    fm.setDefaultCloseOperation(EXIT_ON_CLOSE);

    JButton save = new JButton("Save");
    JButton open =new JButton("Open");
   //button return label to actionperformed 
    openand f = new openand();
    
    save.addActionListener(f);
    open.addActionListener(f);
    l = new JLabel("Select a file");

    JPanel panel = new JPanel();
    panel.add(open);
    panel.add(save);
    panel.add(l);

    fm.add(panel);
}
@Override
public void actionPerformed(ActionEvent e) {
   String s  = e.getActionCommand();

   if(s.equals("Save"))
   {
      JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      int res = fc.showOpenDialog(null);

      System.out.println("Selected file is --> "+fc.getSelectedFile());
      //print the path of file

      fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      //Use JFileChooser to select directory only

      fc.setMultiSelectionEnabled(true);

     



      if(res==JFileChooser.APPROVE_OPTION)
         l.setText(fc.getSelectedFile().getAbsolutePath());
         File file = fc.getSelectedFile();
         int t = 0;
         
         while(t++<)
         
   }
   
  

    
}
}

