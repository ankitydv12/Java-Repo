import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class button04 {
    public static void main(String[] args) {
        
        new buttondemo();
    }
}

class buttondemo extends JFrame implements ActionListener{
    
    Button button;
    ImageIcon img;
    
    public buttondemo()
    {
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        img = new ImageIcon("button.png");

        button = new Button("This is button");
        button.setBounds(200, 100, 300, 300);
        button.setFocusable(false);
        button.setBackground(Color.CYAN);
        button.addActionListener(this);
        /*
         * Adding action by lambda method
         * button.addActionListener(e->System.out.println("button");
         */
        this.add(button);
        
        
    }
    
    public void actionperformed(ActionEvent e)
    {
        if(e.getSource()==button)
            System.out.println("Button press");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button)
        {
            System.out.println("Button");
            button.setFont(new Font("Comic Sans", Font.BOLD, 25));
            this.getContentPane().setBackground(new Color(25, 43, 23));

           
        }
    }

    
}
