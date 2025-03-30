package Learn;

import javax.swing.*;
import java.awt.event.*;

public class NewWindowExample extends JFrame {

    public NewWindowExample() {
        setTitle("Main Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); 

        // Using Key Bindings for Ctrl + N
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK), "newWindow");

        getRootPane().getActionMap().put("newWindow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNewWindow();
            }
        });

        setVisible(true);
    }

    private void openNewWindow() {
        SwingUtilities.invokeLater(() -> new NewWindowExample());
    }

    public static void main(String[] args) {
        new NewWindowExample();
    }
}

