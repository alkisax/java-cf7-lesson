package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        this.setTitle("hello codng frame"); // τον κληρονομήσαμε απο το jframe
        this.setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(new JLabel("coding factory"));

        JButton btn = new JButton("click me");
        contentPane.add(btn);
        btn.addActionListener(new ActionListener() { // egine me tab
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello coding factory", "hello", JOptionPane.INFORMATION_MESSAGE); // Η joption δίνει popup
            }
        });
    }
}
