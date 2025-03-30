package Learn;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class JFileChooserDemo {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        /*
         * JFileChooser() – empty constructor that points to user’s default directory  
         */
        fc.showOpenDialog(null);
        //fc.showOpenDialog return 0 if file choosed and if 1 if cancel to choose
        /**
         * JFileChooser.APPROVE_OPTION → If the user selects a file and clicks "Open" (APPROVE_OPTION=1)
         *   JFileChooser.CANCEL_OPTION → If the user clicks "Cancel" (APPROVE_OPTION=0)
         */

    }
}
