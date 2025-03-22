import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label03 {
    public static void main(String[] args) {
        MyFrame fm = new MyFrame();
        fm.setSize(1200,1200);
        fm.setTitle("label03");
        

        JLabel label = new JLabel();
        label.setText("Set text of label");


        fm.add(label);
        /*
         * to add label:
         *      Create an Object of JLabel
         *     .setText("label1") to add text in the Label 
         *      .add()  => to add label to the frame
         */


        ImageIcon image = new ImageIcon("/media/ankit/52EEF87BEEF85925/Learning/Java-Repo/01_Basics/logo.png");
        label.setIcon(image);
        

        label.setHorizontalTextPosition(JLabel.CENTER);
        //set in LEFT , RIGHT , CENTER


        label.setVerticalTextPosition(JLabel.TOP);
        // set label text in TOP , BOTTOM , CENTER


        label.setForeground(Color.RED);
        // set the color of the label(text)


        label.setFont(new Font("My Boli", Font.PLAIN, 28));
        /*
        * set the font style 
        * new(String name,int Style,int size)
                name => font name
                Style => This constant value 
                         Font.PLAIN = 0
                         Font.BLOD =1
                         Font.ITALIC =2
                size => font size
        */
        
        
        label.setIconTextGap(9); // set the gap b/w text and image 


        label.setBackground(Color.black); // set bg of label
        label.setOpaque(true); // display the color


        Border border = BorderFactory.createLineBorder(Color.ORANGE);
        label.setBorder(border);
/*
 * 
*/

    
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // set  horizontal postional of text and label


        //label.setBounds(100, 90, 250, 250);
        /*
         * setBounds(int x ,int y,int width,int height)
         *      int x => postion on x axis
         *      int int y = pos on y axis
         *      int width , int height = w and h of component or label
         */

        // fm.setLayout(null);
        /*
         *  Border layout is by default
         */

        fm.pack(); //Note: comment or remove Layout manager && add all component before pack 
        // pack the frmae or window according  to the content of label



        System.out.println("\t this Label03");

    }

}
