package Learn;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class restrictedfile extends JFrame implements ActionListener {
    static JLabel l;
    public restrictedfile()
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
    restrictedfile f = new restrictedfile();
    
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
      fc.setDialogTitle("Choose Multiple File");

      
      fc.setMultiSelectionEnabled(true);
      //alow to select multiple file  
      
      
      int res = fc.showOpenDialog(null);
      System.out.println("Selected file is --> "+fc.getSelectedFile());
      //print the path of file

      fc.setAcceptAllFileFilterUsed(false);
      //  Determines whether the AcceptAll FileFilter is used as an available choice in the choosable filter list. If false, the AcceptAll file filter is removed from the list of available file filters. If true, the AcceptAll file filter will become the actively used file filter.

      FileNameExtensionFilter restict = new FileNameExtensionFilter("only text file", "txt");
      fc.addChoosableFileFilter(restict);
 
      

      

      if(res==JFileChooser.APPROVE_OPTION)
         l.setText("");
         File file[] = fc.getSelectedFiles();
         int t = 0;
         
         
        while(t++<file.length)
        {
            l.setText(l.getText()+" "+file[t-1].getName());
        }
         
   }
   
  

    
}
}

