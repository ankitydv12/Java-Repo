import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel04  {
    public static void main(String[] args) {

        //JPanel is GUI component that function as a container to hold other component 

        MyFrame fm = new MyFrame();
         fm.setLayout(null);
         fm.setSize(700, 800);


        JPanel panel = new JPanel();
        JPanel redpanel = new JPanel();
        JLabel label = new JLabel("Hi");
        ImageIcon img = new ImageIcon("logo.png");
        label.setIcon(img);
        
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setHorizontalTextPosition(1);

        label.setLayout(null);
        label.setBounds(500, 150, 56, 89);
        


        panel.setBackground(Color.RED);
        redpanel.setBackground(Color.blue);
        
        panel.add(label);

        panel.setBounds(0, 0, 500, 500);
        redpanel.setBounds(500, 0, 500, 500);



        fm.add(panel);
        fm.add(redpanel);


        

    }
    
}
