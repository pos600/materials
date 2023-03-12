package GUISwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Flowlayout {

    public static void main(String[] args) {
        
        //make system reactive.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout()); //automatically readjusts the button on window size change (reactive)
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 10)); //POSITIONING, layout set to center by default, BESIDE IT ARE GAP VALUES
        // frame.setVisible(true); //window needs to be readjusted/moved for the buttons to appear -> solution: place setVisible to the bottom

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        // frame.add(new JButton("1")); // JButton creation shortcut
        // frame.add(new JButton("2"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9"));

        panel.add(new JButton("1")); // JButton creation shortcut
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
    
}
