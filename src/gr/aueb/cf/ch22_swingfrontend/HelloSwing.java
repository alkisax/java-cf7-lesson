package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("First swing app");
        jFrame.setSize(600, 300);
        jFrame.setLocationRelativeTo(null); // Στοιχίζει ως προς κάτι άλλο. null δηλ ως προς την οθόνη
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        jFrame.setContentPane(contentPane);


        contentPane.add(new JLabel("hello world"));
        jFrame.setVisible(true);


    }
}
