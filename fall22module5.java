package cop2805; // using cop2805, but not from actual course

import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {

        // the Frame created
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // the MenuBar and adding components created
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        // the panel at bottom and adding components created
        JPanel panel = new JPanel(); // panal not visble on output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(11); // accepting 11 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); 
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        
        JTextArea ta = new JTextArea();

        //Components to the frame added
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}