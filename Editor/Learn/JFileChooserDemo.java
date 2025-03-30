package Learn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;

public class JFileChooserDemo extends JFrame implements ActionListener {
   
public static void main(String[] args) {
 


 /*
    * JFileChooser() – empty constructor that points to user’s default directory 
    * JFileChooser(String) – uses the given path 
       *JFileChooser j = new JFileChooser(new File("C:\\Users\\pc\\Documents\\New folder\\"));
    * JFileChooser(FileSystemView) – uses the given FileSystemView 
       *JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());
       *May allow customization of how the file chooser interacts with the file system
          *(e.g., showing or hiding certain drives, folders, or network locations).
*/



JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
/*
 * The method FileSystemView.getFileSystemView() returns an instance of FileSystemView, 
   which provides information about the file system of the underlying operating system.
 */


 
int res =fc.showOpenDialog(null);
//fc.showOpenDialog return 0 if file choosed and if 1 if cancel to choose
/*
 * JFileChooser.APPROVE_OPTION → If the user selects a file and clicks "Open" (APPROVE_OPTION=1)
 *   JFileChooser.CANCEL_OPTION → If the user clicks "Cancel" (APPROVE_OPTION=0)
 */
System.out.println(res);


    }
@Override
public void actionPerformed(ActionEvent e) {
    
}
}
