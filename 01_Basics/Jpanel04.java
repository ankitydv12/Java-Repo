import java.awt.Color;

import javax.swing.JPanel;

public class Jpanel04  {
    public static void main(String[] args) {

        //JPanel is GUI component that function as a container to hold other component 

        MyFrame fm = new MyFrame();
        fm.setLayout(null);


        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setBounds(0, 0, 255, 255);
        fm.add(panel);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.BLUE);
        redpanel.setBounds(255, 0, 255, 255);
        fm.add(redpanel);

    }
    
}
