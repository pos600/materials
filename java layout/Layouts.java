package GUISwing;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));// new BorderLayout(10, 0) <- margin (gaps)
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100)); //changing width wont do anything, but height can be adjusted NORTH
        panel2.setPreferredSize(new Dimension(100, 100)); //WEST, thus width can be edited but height stays
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //======================== SUBPANELS ========================

        // JPanel panel6 = new JPanel();
        // JPanel panel7 = new JPanel();
        // JPanel panel8 = new JPanel();
        // JPanel panel9 = new JPanel();
        // JPanel panel10 = new JPanel();

        // panel6.setBackground(Color.black);
        // panel7.setBackground(Color.gray);
        // panel8.setBackground(Color.lightGray);
        // panel9.setBackground(Color.ORANGE);
        // panel10.setBackground(Color.cyan);

        // panel5.setLayout(new BorderLayout()); //setting it as a new layout

        // panel6.setPreferredSize(new Dimension(50, 50));
        // panel7.setPreferredSize(new Dimension(50, 50));
        // panel8.setPreferredSize(new Dimension(50, 50));
        // panel9.setPreferredSize(new Dimension(50, 50));
        // panel10.setPreferredSize(new Dimension(50, 50));

        // panel5.add(panel6, BorderLayout.NORTH); //a panel within a panel
        // panel5.add(panel7, BorderLayout.SOUTH); //a panel within a panel
        // panel5.add(panel8, BorderLayout.EAST); //a panel within a panel
        // panel5.add(panel9, BorderLayout.WEST); //a panel within a panel
        // panel5.add(panel10, BorderLayout.CENTER); //a panel within a panel


        //======================== SUBPANELS ========================


        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

    }
    
}
