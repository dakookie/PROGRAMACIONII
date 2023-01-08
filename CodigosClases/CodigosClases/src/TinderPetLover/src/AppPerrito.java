import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import BusinessLogic.Cliente;

/**
 * @author: dakookie
 * @date: 16.dic.2022
 * @version: 1.1
 * Determinar el área de un rectángulo
 */
public class AppPerrito {
    public static void main(String[] args) {
        

        MasterFrame frm = new MasterFrame();
        Cliente c = new Cliente();
        c.Nacer("pepe");
        c.Crecer();
        c.reproducirseAmor();

        //frm.setTitle("Principal");                               
        //frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        //frm.setResizable(false);                                   
        //frm.setSize(500,500);                  
        //frm.setVisible(true);                                      
        //frmlcon image = new Imagelcon("logo.png");                 
        //frm.setlconlmage(image.getlmage());                        
        //frm.getContentPane().setBackground(new  Color(12,45,54)); 

        //ImageIcon imagen = new ImageIcon("logo.png");
        //frm.setIconImage(imagen.getImage());
        //frm.getContentPane().setBackground(new Color (12,111,54));


    }
}
