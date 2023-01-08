import java.awt.Color;
import java.util.concurrent.Flow;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MasterFrame extends JFrame{

    JPanel p;

    MasterFrame(){
        this.setTitle("Principal");
        ImageIcon image = new ImageIcon("Resource//Logo.png");
        this.setIconImage(image.getImage());

        this.setLayout(null);
        gridJP(); bordJP(); flowJP();

        jbP1 = new JButton("Panel 1");
        jbP2 = new JButton("Panel 2");
        jbP3 = new JButton("Panel 3");

        jp1.setBounds(10,10,200,200);
        jp2.setBounds(240,10,400,250);
        jp3.setBounds(10,270,400,150);
        
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);

        
        this.getContentPane().setBackground(new Color(12,111,54));
    }
}
