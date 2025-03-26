import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIManager01 extends JFrame implements ActionListener{
   
    public static void main(String[] args) throws Exception
    {
        try {
            UIManager.setLookAndFeel("javax.swing,plaf.NimbusLookAndFeel");
            UIManager.put("button.background", Color.BLUE);
            
        } catch (Exception e)
           {
            e.printStackTrace();
           }
        

        JFrame fm = new JFrame("UIManager");
        fm.setVisible(true);
        fm.setSize(500,500);
        fm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fm.setResizable(true);
        
        JButton button = new JButton();
        button.setBounds(100, 100, 80, 80);
        fm.add(button);
        fm.setLayout(null);
        fm.setLocationRelativeTo(null);
        JFrame.setDefaultLookAndFeelDecorated(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
    }

    
}

